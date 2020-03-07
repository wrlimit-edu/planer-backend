package com.wrlimit.planerbackend.controller.rest;

import com.wrlimit.planerbackend.model.Category;
import com.wrlimit.planerbackend.service.category.interfaces.ICategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("api/category")
public class CategoryRestController {
    private final ICategoryService categoryService;

    public CategoryRestController(ICategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public List<Category> getAll() {
        return categoryService.getAll();
    }

    @PostMapping
    public Category create(@RequestBody Category category) {
        return categoryService.create(category);
    }

    @GetMapping("{id}")
    public Category get(@PathVariable("id") String id) {
        return categoryService.get(id);
    }

    @PutMapping
    public Category update(@RequestBody Category category) {
        return categoryService.update(category);
    }

    @DeleteMapping("{id}")
    public Category delete(@PathVariable("id") String id) {
        return categoryService.delete(id);
    }

}
