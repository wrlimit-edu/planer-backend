package com.wrlimit.planerbackend.service.task.impls;

import com.wrlimit.planerbackend.dao.task.interfaces.ITaskDao;
import com.wrlimit.planerbackend.model.Task;
import com.wrlimit.planerbackend.service.task.interfaces.ITaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements ITaskService {
    private final ITaskDao taskDao;

    @Autowired
    public TaskServiceImpl(ITaskDao taskDao) {
        this.taskDao = taskDao;
    }

    @Override
    public Task create(Task task) {
        return taskDao.create(task);
    }

    @Override
    public Task get(Integer id) {
        return taskDao.get(id);
    }

    @Override
    public Task update(Task task) {
        return taskDao.update(task);
    }

    @Override
    public Task delete(Integer id) {
        return taskDao.delete(id);
    }

    @Override
    public List<Task> getAll() {
        return taskDao.getAll();
    }
}
