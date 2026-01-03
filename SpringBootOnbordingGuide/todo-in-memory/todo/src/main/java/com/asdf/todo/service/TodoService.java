/**
 * Todo 리스트 관리 서비스 빈 구현 주요 애노테이션은 @Service, @Autowired @AutoWired를 이용한 의존성 주입은 다음과 같이 생성자 외에도 필드나
 * 메서드에서도 적용할 수 있음. * 생성자 주입 : 생성자를 통해 의전송을 주입하는 방식, 불변성과 테스트 용이성을 높여주는 장점 * 필두 주입 : 필드에
 * 직접 @Autowired 애노테이션을 붙여 사용하는 방식, 간결하지만 테스트시 모킹이 어렵다는 단점 * 세터 주입 : 세터 메서드에 애노테이션을 붙여 사용하는 방식, 필요한
 * 경우 의존성을 변경할 수 있는 유연성을 제공
 */
package com.asdf.todo.service;

import com.asdf.todo.model.Todo;
import com.asdf.todo.repository.TodoInMemoryRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// 해당 애노테이션이 수식하는 클래스가 서비스 역할을 하는 스프링 빈임을 나타냄
@Service
public class TodoService {
    private final TodoInMemoryRepository todoRepository;

    // 스프링이 자동으로 의존성 주입을 수행하게 함.
    @Autowired
    public TodoService(TodoInMemoryRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> findAll() {
        return todoRepository.findAll();
    }

    public Todo findById(Long id) {
        return todoRepository.findBYId(id);
    }

    public Todo save(Todo todo) {
        return todoRepository.save(todo);
    }

    public Todo update(Long id, Todo todo) {
        todo.setId(id);
        return todoRepository.save(todo);
    }

    public void delete(Long id) {
        todoRepository.deleteById(id);
    }
}
