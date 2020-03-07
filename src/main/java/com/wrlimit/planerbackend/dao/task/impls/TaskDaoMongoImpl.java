package com.wrlimit.planerbackend.dao.task.impls;

import com.wrlimit.planerbackend.dao.task.interfaces.ITaskDao;
import com.wrlimit.planerbackend.model.Task;
import com.wrlimit.planerbackend.repository.TaskMongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Qualifier("mongo")
public class TaskDaoMongoImpl implements ITaskDao {
    private final TaskMongoRepository taskRepository;

    @Autowired
    public TaskDaoMongoImpl(TaskMongoRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task create(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public Task get(String id) {
        return taskRepository.findById(id).orElse(null);
    }

    @Override
    public Task update(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public Task delete(String id) {
        Task task = this.get(id);
        taskRepository.deleteById(id);
        return task;
    }

    @Override
    public List<Task> getAll() {
        return taskRepository.findAll();
    }
}
