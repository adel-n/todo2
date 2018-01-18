package com.greenfoxacademy.todo.services;

import com.greenfoxacademy.todo.models.Assignee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AssigneeService {

  Assignee getAssignee(Integer id);
  List<Assignee> getAllAssignees();
  void modifyAssignee(Assignee assignee);
  void deleteAssignee(Integer id);
  void addAssignee(Assignee assignee);

}
