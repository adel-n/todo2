package com.greenfoxacademy.todo.factories;

import com.greenfoxacademy.todo.models.Assignee;
import org.springframework.stereotype.Component;

@Component
public class AssigneeFactory {

  public Assignee getEmptyAssignee() {
    return new Assignee();
  }
}
