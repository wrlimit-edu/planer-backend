package com.wrlimit.planerbackend.service.task.interfaces;

import com.wrlimit.planerbackend.model.Category;
import com.wrlimit.planerbackend.model.Task;
import com.wrlimit.planerbackend.service.IGenericService;

import java.util.List;

public interface ITaskService extends IGenericService<Task> {
    List<Task> getAllByCategory(Category category);
}
