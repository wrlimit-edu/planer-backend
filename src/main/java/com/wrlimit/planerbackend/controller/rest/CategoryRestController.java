package com.wrlimit.planerbackend.controller.rest;

import com.wrlimit.planerbackend.model.Category;
import com.wrlimit.planerbackend.service.category.interfaces.ICategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/category")
public class CategoryRestController {
    private final ICategoryService categoryService;

    public CategoryRestController(ICategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping("/create")
    public Category create(@RequestBody Category category) {
        return categoryService.create(category);
    }

    @GetMapping("/get/{id}")
    public Category get(@PathVariable("id") Integer id) {
        return categoryService.get(id);
    }

    @PostMapping("/update")
    public Category update(@RequestBody Category category) {
        return categoryService.update(category);
    }

    @GetMapping("/delete/{id}")
    public Category delete(@PathVariable("id") Integer id) {
        return categoryService.delete(id);
    }

    @RequestMapping("/list")
    public List<Category> getAll() {
        return categoryService.getAll();
    }
}
