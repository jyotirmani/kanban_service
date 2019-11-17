package com.kanban.dto;

public class UserFindDto {

    private String username;

    protected UserFindDto() {
        // Default constructor for Spring
    }

    public UserFindDto(String like) {
        this.username = like;
    }

    public String getUsername() {
        return username;
    }
}
