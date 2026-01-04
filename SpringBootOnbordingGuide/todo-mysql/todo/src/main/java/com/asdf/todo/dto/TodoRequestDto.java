package com.asdf.todo.dto;

import jakarta.annotation.Nonnull;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
public class TodoRequestDto {

    @Nonnull private String title;
    @NonNull private String description;
    private boolean completed = false;

    public TodoRequestDto(String title, String description, boolean completed){
        this.title = title;
        this.description = description;
        this.completed = completed;
    }

    public TodoRequestDto(String title, String description){
        this(title,description,false);
    }
}
