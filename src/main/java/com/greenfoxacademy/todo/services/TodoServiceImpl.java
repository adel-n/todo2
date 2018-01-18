package com.greenfoxacademy.todo.services;

import com.greenfoxacademy.todo.models.Todo;
import com.greenfoxacademy.todo.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService{

  @Autowired
  TodoRepository todoRepository;

  @Override
  public Todo getTodoById(Integer id) {
    return todoRepository.findOne(id);
  }

  @Override
  public List<Todo> getAllTodos() {
    return (List<Todo>) todoRepository.findAll();
  }

  @Override
  public void modifyTodo(Todo todo) {
    todoRepository.save(todo);
  }

  @Override
  public void deleteTodo(Integer id) {
    todoRepository.delete(id);
  }

  @Override
  public void addTodo(Todo todo) {
    todoRepository.save(todo);
  }

  @Override
  public List<Todo> searchByTitle(String title) {
    return todoRepository.findAllByTitleContains(title);
  }
}
