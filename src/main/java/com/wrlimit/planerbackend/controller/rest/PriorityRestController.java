package com.wrlimit.planerbackend.controller.rest;

import com.wrlimit.planerbackend.model.Priority;
import com.wrlimit.planerbackend.service.priority.interfaces.IPriorityService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("api/priority")
public class PriorityRestController {
    private final IPriorityService priorityService;

    public PriorityRestController(IPriorityService priorityService) {
        this.priorityService = priorityService;
    }

    @GetMapping
    public List<Priority> getAll() {
        return priorityService.getAll();
    }

    @PostMapping
    public Priority create(@RequestBody Priority priority) {
        return priorityService.create(priority);
    }

    @GetMapping("{id}")
    public Priority get(@PathVariable("id") String id) {
        return priorityService.get(id);
    }

    @PutMapping
    public Priority update(@RequestBody Priority priority) {
        return priorityService.update(priority);
    }

    @DeleteMapping("{id}")
    public Priority delete(@PathVariable("id") String id) {
        return priorityService.delete(id);
    }
}
