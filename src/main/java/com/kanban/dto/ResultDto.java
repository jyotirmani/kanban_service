package com.kanban.dto;

public class ResultDto {
    private String result;

    protected ResultDto() {
        // Default for Spring
    }

    public ResultDto(String result) {

        this.result = result;
    }

    public String getResult() {
        return result;
    }

}
