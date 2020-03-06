package com.wrlimit.planerbackend.controller.rest;

import com.wrlimit.planerbackend.model.Priority;
import com.wrlimit.planerbackend.service.priority.interfaces.IPriorityService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/priority")
public class PriorityRestController {
    private final IPriorityService priorityService;

    public PriorityRestController(IPriorityService priorityService) {
        this.priorityService = priorityService;
    }

    @PostMapping("/create")
    public Priority create(@RequestBody Priority priority) {
        return priorityService.create(priority);
    }

    @GetMapping("/get/{id}")
    public Priority get(@PathVariable("id") Integer id) {
        return priorityService.get(id);
    }

    @PostMapping("/update")
    public Priority update(@RequestBody Priority priority) {
        return priorityService.update(priority);
    }

    @GetMapping("/delete/{id}")
    public Priority delete(@PathVariable("id") Integer id) {
        return priorityService.delete(id);
    }

    @RequestMapping("/list")
    public List<Priority> getAll() {
        return priorityService.getAll();
    }
}
