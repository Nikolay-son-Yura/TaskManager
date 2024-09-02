package ru.gb.impl;

import org.springframework.stereotype.Service;
import ru.gb.task.model.Status;
import ru.gb.task.model.Task;
import ru.gb.task.repository.TaskRepository;
import ru.gb.task.service.TaskService;
import ru.gb.user.model.User;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImpl implements TaskService {

    private TaskRepository taskRepository;

    @Override
    public Task createTask(Task task, User user) {
        task.setAssignee(user);
        task.setCreatedAt(Instant.now());
        return taskRepository.save(task);
    }

    @Override
    public Task getTaskById(Long id) {
        Optional<Task> getTask = taskRepository.findById(id);
        return getTask.orElseThrow();
    }

    @Override
    public Task getTaskUserId(User user) {
        return taskRepository.findByAssigneeId(user.getId());
    }

    @Override
    public Task updateTask(Task task, Long id) {
        return null;
    }

    @Override
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }

    @Override
    public List<Task> getAllTask() {
        return taskRepository.findAll();
    }

    public Status statusTask(Task task) {
        return task.getStatus();
    }
}
