package com.wrlimit.planerbackend.dao.category.impls;

import com.wrlimit.planerbackend.dao.category.interfaces.ICategoryDao;
import com.wrlimit.planerbackend.model.Category;
import com.wrlimit.planerbackend.model.Priority;
import com.wrlimit.planerbackend.repository.CategoryMongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CategoryDaoMongoImpl implements ICategoryDao {
    private final CategoryMongoRepository categoryRepository;

    @Autowired
    public CategoryDaoMongoImpl(CategoryMongoRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Category create(Category category) {
        Integer lastId = this.getAll().stream()
                .mapToInt(Category::getId).max().orElse(0);
        category.setId(lastId + 1);
        return categoryRepository.save(category);
    }

    @Override
    public Category get(Integer id) {
        return categoryRepository.findById(id).orElse(null);
    }

    @Override
    public Category update(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category delete(Integer id) {
        Category category = this.get(id);
        categoryRepository.deleteById(id);
        return category;
    }

    @Override
    public List<Category> getAll() {
        return categoryRepository.findAll();
    }
}
