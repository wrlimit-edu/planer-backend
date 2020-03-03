package com.wrlimit.planerbackend.dao.task.impls;

import com.wrlimit.planerbackend.dao.task.interfaces.ITaskDao;
import com.wrlimit.planerbackend.model.Task;
import com.wrlimit.planerbackend.repository.TaskMongoRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TaskDaoImpl implements ITaskDao {
    private final TaskMongoRepository taskRepository;

    public TaskDaoImpl(TaskMongoRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task create(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public Task get(Long id) {
        return taskRepository.findById(id).orElse(null);
    }

    @Override
    public Task update(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public Task delete(Long id) {
        Task task = this.get(id);
        taskRepository.deleteById(id);
        return task;
    }

    @Override
    public List<Task> getAll() {
        return taskRepository.findAll();
    }
}
