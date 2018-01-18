package com.greenfoxacademy.todo.repositories;

import com.greenfoxacademy.todo.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Integer> {
  List<Todo> findAllByTitleContains(String title);
}
