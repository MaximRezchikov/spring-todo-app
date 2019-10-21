package com.spring.project.service;

import com.spring.project.dao.TaskDao;
import com.spring.project.dao.TaskDaoImpl;
import com.spring.project.model.Task;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {
    private TaskDao taskDao = new TaskDaoImpl();

    @Override
    public void createTask(Task task) {
        taskDao.add(task);
    }

    @Override
    public void deleteTask(Task task) {
        taskDao.deleteById(task.getTaskId());
    }

    @Override
    public void setStatus() {
        taskDao.setStatus();
    }

    @Override
    public List<Task> getAllTask() {
        return taskDao.getAllTask();
    }
}
