package com.greenfoxacademy.todo.services;

import com.greenfoxacademy.todo.models.Todo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TodoService {

  Todo getTodoById(Integer id);
  List<Todo> getAllTodos();
  void modifyTodo(Todo todo);
  void deleteTodo(Integer id);
  void addTodo(Todo todo);
  List<Todo> searchByTitle(String title);
}
