package com.wrlimit.planerbackend.service.category.impls;

import com.wrlimit.planerbackend.dao.category.interfaces.ICategoryDao;
import com.wrlimit.planerbackend.model.Category;
import com.wrlimit.planerbackend.service.category.interfaces.ICategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements ICategoryService {
    private final ICategoryDao categoryDao;

    public CategoryServiceImpl(ICategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }

    @Override
    public Category create(Category category) {
        return categoryDao.create(category);
    }

    @Override
    public Category get(Long id) {
        return categoryDao.get(id);
    }

    @Override
    public Category update(Category category) {
        return categoryDao.update(category);
    }

    @Override
    public Category delete(Long id) {
        return categoryDao.delete(id);
    }

    @Override
    public List<Category> getAll() {
        return categoryDao.getAll();
    }
}
