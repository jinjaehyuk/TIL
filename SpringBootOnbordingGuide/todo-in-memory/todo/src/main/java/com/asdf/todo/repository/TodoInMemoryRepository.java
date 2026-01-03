/** TO-DO 리스트 리포지토리 빈 구현 Todo 항목을 저장, 조회, 수정, 삭제하는 CRUD AtomeicLong을 사용하여 Todo 항목의 고유 ID를 자동으로 생성 */
package com.asdf.todo.repository;

import com.asdf.todo.model.Todo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Repository;

// 스프링이 자동으로 해당 클래스를 리포지토리 빈으로 관리하도록 하며
// 다른빈이 이 리포지토리 빈을 사용할 수 있도록 만든다
@Repository
public class TodoInMemoryRepository {
    private final Map<Long, Todo> todoMap = new HashMap<>();
    private final AtomicLong counter = new AtomicLong();

    public List<Todo> findAll() {
        return new ArrayList<>(todoMap.values());
    }

    public Todo findBYId(Long id) {
        return todoMap.get(id);
    }

    public Todo save(Todo todo) {
        if (todo.getId() == null) {
            todo.setId(counter.incrementAndGet());
        }
        todoMap.put(todo.getId(), todo);
        return todo;
    }

    public void deleteById(Long id) {
        todoMap.remove(id);
    }
}
