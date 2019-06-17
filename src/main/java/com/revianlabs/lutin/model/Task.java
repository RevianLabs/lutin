package com.revianlabs.lutin.model;

import java.time.LocalDateTime;
import java.util.List;

public class Task {
    private String id;
    private String name;
    private String description;
    private boolean completed;
    private LocalDateTime start;
    private LocalDateTime end;
    private List<User> assignee;
    private Priority priority;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public void setEnd(LocalDateTime end) {
        this.end = end;
    }

    public List<User> getAssignee() {
        return assignee;
    }

    public void setAssignee(List<User> assignee) {
        this.assignee = assignee;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", completed=" + completed +
                ", start=" + start +
                ", end=" + end +
                ", assignee=" + assignee +
                ", priority=" + priority +
                '}';
    }
}
