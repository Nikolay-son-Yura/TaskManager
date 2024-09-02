package ru.gb.task.controller;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import ru.gb.dto.TaskDto;
import ru.gb.dto.UserDto;
import ru.gb.impl.TaskServiceImpl;
import ru.gb.user.service.UserService;
import ru.gb.util.MapperUtil;

import java.util.List;

@Tag(name = "Планировщик задач")
@RestController
public class TaskController {

    private final UserService userService;
    private final TaskServiceImpl taskService;
    private final MapperUtil mapperUtil;

    @Autowired
    public TaskController(UserService userService, TaskServiceImpl taskService, MapperUtil mapperUtil) {
        this.userService = userService;
        this.taskService = taskService;
        this.mapperUtil = mapperUtil;
    }
    @Operation(summary = "Получение исполнителя")
    public UserDto getExecutor(){

        /**
         * в процессе
         */
        return null;
    }
    @Operation(summary = "Получение списка задач пользователя")
    public List<TaskDto> getTasks(){
        /**
         * в процессе
         */
        return null;
    }

    @Operation(summary = "Создание задачи")
    public ResponseEntity<HttpStatus> addTask(){
        /**
         * в процессе
         */
        return ResponseEntity.ok(HttpStatus.OK);
    }
    @Operation(summary = "Изменение задачи")
    public ResponseEntity<HttpStatus> updateTask(){
        /**
         * в процессе
         */
        return ResponseEntity.ok(HttpStatus.OK);
    }
    @Operation(summary = "Удаление задачи")
    public ResponseEntity<HttpStatus> deleteTask(){
        /**
         * в процессе
         */
        return ResponseEntity.ok(HttpStatus.OK);
    }





}
