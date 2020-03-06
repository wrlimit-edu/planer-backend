package com.wrlimit.planerbackend.controller.rest;

import com.wrlimit.planerbackend.model.Task;
import com.wrlimit.planerbackend.service.task.interfaces.ITaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/task")
public class TaskRestController {
    private final ITaskService taskService;

    public TaskRestController(ITaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping("/create")
    public Task create(@RequestBody Task task) {
        return taskService.create(task);
    }

    @GetMapping("/get/{id}")
    public Task get(@PathVariable("id") Integer id) {
        return taskService.get(id);
    }

    @PostMapping("/update")
    public Task update(@RequestBody Task task) {
        return taskService.update(task);
    }

    @GetMapping("/delete/{id}")
    public Task delete(@PathVariable("id") Integer id) {
        return taskService.delete(id);
    }

    @RequestMapping("/list")
    public List<Task> getAll() {
        return taskService.getAll();
    }
}
