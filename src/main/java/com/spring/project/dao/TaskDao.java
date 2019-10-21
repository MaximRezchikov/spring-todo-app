package com.spring.project.dao;

import com.spring.project.model.Task;

import java.util.List;

public interface TaskDao extends Dao<Task> {
    String setStatus();

    List<Task> getAllTask();
}
