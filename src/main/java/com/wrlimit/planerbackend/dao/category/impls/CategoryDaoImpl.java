package com.wrlimit.planerbackend.dao.category.impls;

import com.wrlimit.planerbackend.dao.category.interfaces.ICategoryDao;
import com.wrlimit.planerbackend.model.Category;
import com.wrlimit.planerbackend.repository.CategoryMongoRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CategoryDaoImpl implements ICategoryDao {
    private final CategoryMongoRepository categoryRepository;

    public CategoryDaoImpl(CategoryMongoRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Category create(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category get(Long id) {
        return categoryRepository.findById(id).orElse(null);
    }

    @Override
    public Category update(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category delete(Long id) {
        Category category = this.get(id);
        categoryRepository.deleteById(id);
        return category;
    }

    @Override
    public List<Category> getAll() {
        return categoryRepository.findAll();
    }
}
