package com.spring.project.service;

import com.spring.project.model.Task;

import java.util.List;

public interface TaskService {
    void createTask(Task task);

    void deleteTask(Task task);

    void setStatus();

    List<Task> getAllTask();
}
