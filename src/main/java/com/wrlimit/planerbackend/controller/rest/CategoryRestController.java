package com.wrlimit.planerbackend.controller.rest;

import com.wrlimit.planerbackend.model.Category;
import com.wrlimit.planerbackend.service.category.interfaces.ICategoryService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/category")
public class CategoryRestController {
    private final ICategoryService categoryService;

    public CategoryRestController(ICategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @RequestMapping("/list")
    public List<Category> getAll() {
        return categoryService.getAll();
    }
}
