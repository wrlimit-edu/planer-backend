package com.wrlimit.planerbackend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.Objects;

@Document
public class Task {
    @Id
    private String id;
    private String name;
    private Category category;
    private Priority priority;
    private boolean completed;
    private LocalDate date;

    public Task() {
    }

    public Task(String name, Category category, Priority priority, boolean completed, LocalDate date) {
        this.name = name;
        this.category = category;
        this.priority = priority;
        this.completed = completed;
        this.date = date;
    }

    public Task(String id, String name, Category category, Priority priority, boolean completed, LocalDate date) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.priority = priority;
        this.completed = completed;
        this.date = date;
    }

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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(id, task.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Task{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", category=" + category +
                ", priority=" + priority +
                ", completed=" + completed +
                ", date=" + date +
                '}';
    }
}
