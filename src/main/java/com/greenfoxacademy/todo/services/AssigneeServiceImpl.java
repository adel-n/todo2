package com.greenfoxacademy.todo.services;

import com.greenfoxacademy.todo.models.Assignee;
import com.greenfoxacademy.todo.repositories.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssigneeServiceImpl implements AssigneeService {

  @Autowired
  AssigneeRepository assigneeRepository;

  @Override
  public Assignee getAssignee(Integer id) {
    return assigneeRepository.findOne(id);
  }

  @Override
  public List<Assignee> getAllAssignees() {
    return (List<Assignee>) assigneeRepository.findAll() ;
  }

  @Override
  public void modifyAssignee(Assignee assignee) {
    assigneeRepository.save(assignee);
  }

  @Override
  public void deleteAssignee(Integer id) {
    assigneeRepository.delete(id);
  }

  @Override
  public void addAssignee(Assignee assignee) {
    assigneeRepository.save(assignee);
  }
}
