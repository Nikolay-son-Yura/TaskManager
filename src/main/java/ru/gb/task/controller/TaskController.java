package ru.gb.task.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import ru.gb.mail.impl.TaskServiceImpl;
import ru.gb.mail.util.MapperUtil;

@RestController

public class TaskController {

//    private final User
    private final TaskServiceImpl taskService;
    private final MapperUtil mapperUtil;

    @Autowired
    public TaskController(TaskServiceImpl taskService, MapperUtil mapperUtil) {
        this.taskService = taskService;
        this.mapperUtil = mapperUtil;
    }


}
