package com.wrlimit.planerbackend.controller.rest;

import com.wrlimit.planerbackend.model.Task;
import com.wrlimit.planerbackend.service.task.interfaces.ITaskService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/task")
public class TaskRestController {
    private final ITaskService taskService;

    public TaskRestController(ITaskService taskService) {
        this.taskService = taskService;
    }

    @RequestMapping("/list")
    public List<Task> getAll() {
        return taskService.getAll();
    }
}
