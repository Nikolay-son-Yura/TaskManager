package ru.gb.util;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.gb.dto.TaskDto;
import ru.gb.dto.UserDto;
import ru.gb.task.model.Task;
import ru.gb.user.model.User;


@Component
public class MapperUtil {
    private final ModelMapper modelMapper;

    @Autowired
    public MapperUtil(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }
    public UserDto convertToUserDTO(User user) {
        return modelMapper.map(user, UserDto.class);
    }

    public TaskDto convertToTaskDTO(Task task) {
        return modelMapper.map(task, TaskDto.class);
    }

    public Task convertToTask(TaskDto taskDto) {
        return modelMapper.map(taskDto, Task.class);
    }
}
