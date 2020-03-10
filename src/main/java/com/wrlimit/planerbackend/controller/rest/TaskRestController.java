package com.wrlimit.planerbackend.controller.rest;

import com.wrlimit.planerbackend.model.Category;
import com.wrlimit.planerbackend.model.Task;
import com.wrlimit.planerbackend.service.task.interfaces.ITaskService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/task")
public class TaskRestController {
    private final ITaskService taskService;

    public TaskRestController(ITaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public List<Task> getAll() {
        return taskService.getAll();
    }

    @PostMapping
    public Task create(@RequestBody Task task) {
        return taskService.create(task);
    }

    @GetMapping("{id}")
    public Task get(@PathVariable("id") String id) {
        return taskService.get(id);
    }

    @PutMapping
    public Task update(@RequestBody Task task) {
        return taskService.update(task);
    }

    @DeleteMapping("{id}")
    public Task delete(@PathVariable("id") String id) {
        return taskService.delete(id);
    }

    @RequestMapping("category")
    public List<Task> getAllByCategory(@RequestBody Category category) {
        return taskService.getAllByCategory(category);
    }
}
