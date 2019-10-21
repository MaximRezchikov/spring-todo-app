package com.spring.project.storage;

import com.spring.project.model.Task;

import java.util.List;

public class TasksStore {
    List<Task> tasks;

    public TasksStore(List<Task> tasks) {
        this.tasks = tasks;
    }
}