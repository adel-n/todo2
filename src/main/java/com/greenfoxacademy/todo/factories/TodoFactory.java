package com.greenfoxacademy.todo.factories;

import com.greenfoxacademy.todo.models.Todo;
import org.springframework.stereotype.Component;

@Component
public class TodoFactory {

  public Todo getEmptyTodo() {
    return new Todo();
  }
}
