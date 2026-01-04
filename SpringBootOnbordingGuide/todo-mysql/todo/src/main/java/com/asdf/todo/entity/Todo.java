package com.asdf.todo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity //Todo 클래스를 JPA엔터티 클래스로 정의합니다.
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Todo {

    @Id //id필드를 엔티티의 기본키로 지정합니다. 이렇게 지정된 id 필드는 데이터베이스 테이블의 기본키 컬럼과 매핑됩니다. @Column역할도 겸하고있음
    @GeneratedValue(strategy = GenerationType.IDENTITY) // id필드가 자동으로 생성되는 값임을 나타냄.
    private Long id;

    @NotNull
    @Column(nullable = false, name ="title")
    private String title;

    @Column(name ="description")
    private String description;

    @Column(nullable = false, name="completed")
    private boolean completed;

    @Column(
            nullable = false,
            name = "created_at",
            insertable = false,
            updatable = false,
            columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP"
    )
    private LocalDateTime createdAt;
}
