package com.wrlimit.planerbackend.controller.rest;

import com.wrlimit.planerbackend.model.Priority;
import com.wrlimit.planerbackend.service.priority.interfaces.IPriorityService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/priority")
public class PriorityRestController {
    private final IPriorityService priorityService;

    public PriorityRestController(IPriorityService priorityService) {
        this.priorityService = priorityService;
    }

    @RequestMapping("/list")
    public List<Priority> getAll() {
        return priorityService.getAll();
    }
}
