package com.asdf.todo.controller;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static  org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import com.asdf.todo.dto.TodoRequestDto;
import com.asdf.todo.dto.TodoResponseDto;
import com.asdf.todo.entity.Todo;
import com.asdf.todo.service.TodoService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Collections;

import static org.mockito.BDDMockito.given;

//Spring TestContext Framework와 Junit 5를 통합하여 스프링 컨텍스트를 사용할 수 있게 합니다.
@ExtendWith(SpringExtension.class)
//컨트롤러 레이어, 즉 여기에는 TodoController만 로드합니다.
@WebMvcTest(TodoController.class)
public class TodoControllerTests {
    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private TodoService todoService;

    @Test
    public void testGetTodoById() throws Exception{
        TodoResponseDto todo = new TodoResponseDto(1L, "Test Todo", "Description", false);
        todo.setId(1L);
        todo.setTitle("Test Todo");

        given(todoService.findById(1L)).willReturn(todo);

        //perform 메서드는 HTTP요청을 실행
        //andExpect 메서드는 상태코드와 json응답의 특정 필드 확인을 통해 HTTP응답을 검증
        mockMvc.perform(get("/api/todos/v2/1")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(1L))
                .andExpect(jsonPath("$.title").value("Test Todo"));
    }

    @Test
    public void testGetAllTodos() throws Exception {
        given(todoService.findAll()).willReturn(Collections.emptyList());

        mockMvc
                .perform(get("/api/todos/v2").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isNoContent());

        given(todoService.findAll())
                .willReturn(Collections.singletonList(new TodoResponseDto(1L, "Test Todo", "Description", false)));

        mockMvc
                .perform(get("/api/todos/v2").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].id").value(1L))
                .andExpect(jsonPath("$[0].title").value("Test Todo"));
    }

    @Test
    public void testCreateTodo() throws Exception {
        TodoResponseDto todo = new TodoResponseDto(1L, "New Todo", "Description", false);
        todo.setId(1L);
        todo.setTitle("New Todo");

        given(todoService.save(any(TodoRequestDto.class))).willReturn(todo);

        mockMvc
                .perform(
                        post("/api/todos/v2")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content("{\"title\": \"New Todo\",\"description\":\"Description\"}"))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.id").value(1L))
                .andExpect(jsonPath("$.title").value("New Todo"));
    }

    @Test
    public void testUpdateTodo() throws Exception {
        TodoResponseDto existingTodo = new TodoResponseDto(1L, " Existing Todo", "Description",false);
        existingTodo.setId(1L);
        existingTodo.setTitle("Existing Todo");

        TodoResponseDto updatedTodo = new TodoResponseDto(1L, "update Todo","Updated Description", true);
        updatedTodo.setId(1L);
        updatedTodo.setTitle("Updated Todo");

        given(todoService.findById(1L)).willReturn(existingTodo);
        given(todoService.update(anyLong(), any(TodoRequestDto.class))).willReturn(updatedTodo);

        mockMvc
                .perform(
                        put("/api/todos/v2/1")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content("{\"title\": \"Updated Todo\",\"description\":\"Updated Description\"}"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(1L))
                .andExpect(jsonPath("$.title").value("Updated Todo"));
    }

    @Test
    public void testDeleteTodo() throws Exception {
        TodoResponseDto todo = new TodoResponseDto(1L,"Test Todo","Description", false);
        todo.setId(1L);
        todo.setTitle("Test Todo");

        given(todoService.findById(1L)).willReturn(todo);

        mockMvc
                .perform(delete("/api/todos/v2/1").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isNoContent());
    }

}
