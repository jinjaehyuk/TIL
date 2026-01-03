/**
 * Todo 리스트 REST 컨트롤러 빈 구현 1) 엔드포인트 주소를 노출 2) 클라이언트의 요청과 입력을 받음 3) 서비스 레이어의 메서드를 호출한 뒤 4) 그 결과를
 * 클라이언트에게 반환하는 역할 모든 엔드포인트는 /api/todos/v1 로 시작 전체 Todo 항목 조회 id 로 Todo 항목 조회 Todo 항목 생성 id를 기준으로
 * Todo 항목 수정 id를 기준으로 Todo 항목 삭제
 */
package com.asdf.todo.controller;

import com.asdf.todo.model.Todo;
import com.asdf.todo.service.TodoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/todos/v1")
public class TodoController {

    @Autowired private TodoService todoService;

    @GetMapping
    // Swagger에 사용되는 애노테이션
    // API문서화를 위해 사용. 각 메서드에 대해 요약(Summary)와 설명(description)을 작성하여 Swagger Ui에 문서화된 내용을 볼 수 있다.
    @Operation(summary = "전체 작업 조회", description = "전체 작업 조회")
    // API 응답코드를 문서화하는데 사용, 각 응답 코드에 대한 설명을 작성하여 Swagger UI에서 확인할 수 있다.
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "성공"),
        @ApiResponse(responseCode = "400", description = "내용 없음")
    })
    // 모든 Todo 항목 조회 API
    public ResponseEntity<List<Todo>> getAllTodos() {
        List<Todo> todos = todoService.findAll();
        if (todos == null || todos.isEmpty()) {
            // 조회 결과가 비어있으면 HTTP 204(No Content)응답을 반환
            return ResponseEntity.noContent().build();
        }
        // 그렇지 안흥면 HTTP 200(OK)응답과 함께 데이터를 반환
        return ResponseEntity.ok(todos);
    }

    @GetMapping("/{id}")
    @Operation(summary = "작업 조회", description = "ID로 작업 조회")
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "성공"),
        @ApiResponse(responseCode = "400", description = "작업 없음")
    })
    // 특정 ID의 Todo 항목 조회
    public ResponseEntity<Todo> getTodoById(@PathVariable Long id) {
        Todo todo = todoService.findById(id);
        if (todo == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(todo);
    }

    @PostMapping
    @Operation(summary = "작업 생성", description = "새로운 작업 생성")
    @ApiResponses({@ApiResponse(responseCode = "201", description = "생성됨")})
    // Todo 항목 생성
    public ResponseEntity<Todo> createTodo(@RequestBody Todo todo) {
        return ResponseEntity.status(201).body(todoService.save(todo));
    }

    @PutMapping("/{id}")
    @Operation(summary = "작업 수정", description = "ID로 작업수정")
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "성공"),
        @ApiResponse(responseCode = "404", description = "작업 없음")
    })
    public ResponseEntity<Todo> updateTodo(@PathVariable Long id, @RequestBody Todo todo) {
        Todo existingTodo = todoService.findById(id);
        if (existingTodo == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(todoService.update(id, todo));
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "작업 삭제", description = "ID로 작업 삭제")
    @ApiResponses({
        @ApiResponse(responseCode = "204", description = "내용 없음"),
        @ApiResponse(responseCode = "404", description = "작업 없음")
    })
    public ResponseEntity<Void> deleteTodo(@PathVariable Long id) {
        Todo todo = todoService.findById(id);
        if (todo == null) {
            return ResponseEntity.notFound().build();
        }
        todoService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
