package com.wrlimit.planerbackend.dao.priority.impls;

import com.wrlimit.planerbackend.dao.priority.interfaces.IPriorityDao;
import com.wrlimit.planerbackend.model.Priority;
import com.wrlimit.planerbackend.repository.PriorityMongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Qualifier("mongo")
public class PriorityDaoMongoImpl implements IPriorityDao {
    private final PriorityMongoRepository priorityRepository;

    @Autowired
    public PriorityDaoMongoImpl(PriorityMongoRepository priorityRepository) {
        this.priorityRepository = priorityRepository;
    }

    @Override
    public Priority create(Priority priority) {
        return priorityRepository.save(priority);
    }

    @Override
    public Priority get(String id) {
        return priorityRepository.findById(id).orElse(null);
    }

    @Override
    public Priority update(Priority priority) {
        return priorityRepository.save(priority);
    }

    @Override
    public Priority delete(String id) {
        Priority priority = this.get(id);
        priorityRepository.deleteById(id);
        return priority;
    }

    @Override
    public List<Priority> getAll() {
        return priorityRepository.findAll();
    }
}
