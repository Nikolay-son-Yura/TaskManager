package ru.gb.task.service;



import ru.gb.task.model.Task;
import ru.gb.user.model.User;

import java.util.List;

public interface TaskService {

    Task createTask(Task task,User user);

    Task findById(Long id);

    List<Task> findByUserId(Long id);

    Task updateTask(Task task,Long id);

    void deleteTask(Long id);

    List<Task> getAllTask();

}
