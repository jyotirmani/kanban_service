package com.kanban.dto;

public class TaskMoveDto {
    private String state;

    protected TaskMoveDto() {
        // Default constructor for Spring
    }

    public TaskMoveDto(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
