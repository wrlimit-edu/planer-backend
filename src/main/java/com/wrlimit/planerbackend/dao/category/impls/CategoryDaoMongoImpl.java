package com.wrlimit.planerbackend.dao.category.impls;

import com.wrlimit.planerbackend.dao.category.interfaces.ICategoryDao;
import com.wrlimit.planerbackend.model.Category;
import com.wrlimit.planerbackend.repository.CategoryMongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Qualifier("mongo")
public class CategoryDaoMongoImpl implements ICategoryDao {
    private final CategoryMongoRepository categoryRepository;

    @Autowired
    public CategoryDaoMongoImpl(CategoryMongoRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Category create(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category get(String id) {
        return categoryRepository.findById(id).orElse(null);
    }

    @Override
    public Category update(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category delete(String id) {
        Category category = this.get(id);
        categoryRepository.deleteById(id);
        return category;
    }

    @Override
    public List<Category> getAll() {
        return categoryRepository.findAll();
    }
}
