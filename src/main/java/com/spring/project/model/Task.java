package com.spring.project.model;


public class Task {
    private Long taskId;
    private Long userId;
    private String taskName;
	private String status;

    public Task(Long taskId, Long userId, String taskName, String status) {
        this.taskId = taskId;
        this.userId = userId;
        this.taskName = taskName;
        this.status = status;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Task task = (Task) o;

        return taskId != null ? taskId.equals(task.taskId) : task.taskId == null;
    }

    @Override
    public int hashCode() {
        return taskId != null ? taskId.hashCode() : 0;
    }
}
