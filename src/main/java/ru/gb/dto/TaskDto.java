package ru.gb.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaskDto {

    private int id;
    private String header;
    private String description;
    private boolean status;
}
