package com.spring.project.dao;

import com.spring.project.model.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskDaoImpl implements TaskDao {
    static List<Task> tasks = new ArrayList<>();

    public static Task createTask() {
        Task testUser = new Task(1L, 1L, "DoSmth", "open");
        tasks.add(testUser);

        return tasks.get(1);
    }

    @Override
    public Task add(Task task) {
        tasks.add(task);
        return tasks.get(1);
    }

    @Override
    public Task findById(Long id) {
        return tasks.get(id.intValue());
    }

    @Override
    public Task update(Long id) {
        tasks.set(id.intValue(), new Task(1L, 1L, "DoSmth", "close"));
        return tasks.get(id.intValue());
    }

    @Override
    public void deleteById(Long id) {
        tasks.remove(id.intValue());
    }

    @Override
    public String setStatus() {
        Task task = tasks.get(1);
        task.setStatus("notCompleted");
        return task.getStatus();
    }

    @Override
    public List<Task> getAllTask() {
        return tasks;
    }
}
