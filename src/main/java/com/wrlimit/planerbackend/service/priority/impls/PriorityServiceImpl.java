package com.wrlimit.planerbackend.service.priority.impls;

import com.wrlimit.planerbackend.dao.priority.interfaces.IPriorityDao;
import com.wrlimit.planerbackend.model.Priority;
import com.wrlimit.planerbackend.service.priority.interfaces.IPriorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriorityServiceImpl implements IPriorityService {
    private final IPriorityDao priorityDao;

    @Autowired
    public PriorityServiceImpl(@Qualifier("mongo") IPriorityDao priorityDao) {
        this.priorityDao = priorityDao;
    }

    @Override
    public Priority create(Priority priority) {
        return priorityDao.create(priority);
    }

    @Override
    public Priority get(Integer id) {
        return priorityDao.get(id);
    }

    @Override
    public Priority update(Priority priority) {
        return priorityDao.update(priority);
    }

    @Override
    public Priority delete(Integer id) {
        return priorityDao.delete(id);
    }

    @Override
    public List<Priority> getAll() {
        return priorityDao.getAll();
    }
}
