package com.wrlimit.planerbackend.dao.task.impls;

import com.wrlimit.planerbackend.dao.task.interfaces.ITaskDao;
import com.wrlimit.planerbackend.model.Category;
import com.wrlimit.planerbackend.model.Task;
import com.wrlimit.planerbackend.repository.TaskMongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TaskDaoMongoImpl implements ITaskDao {
    private final TaskMongoRepository taskRepository;

    @Autowired
    public TaskDaoMongoImpl(TaskMongoRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task create(Task task) {
        Integer lastId = this.getAll().stream()
                .mapToInt(Task::getId).max().orElse(0);
        task.setId(lastId + 1);
        return taskRepository.save(task);
    }

    @Override
    public Task get(Integer id) {
        return taskRepository.findById(id).orElse(null);
    }

    @Override
    public Task update(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public Task delete(Integer id) {
        Task task = this.get(id);
        taskRepository.deleteById(id);
        return task;
    }

    @Override
    public List<Task> getAll() {
        return taskRepository.findAll();
    }
}
