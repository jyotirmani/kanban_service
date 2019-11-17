package com.kanban.service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Service;

import com.kanban.model.TaskStatus;

@Service
public class TaskService {

    @Autowired
    private TaskRepository repository;

    public GroupingTask getLists() {
        List<Task> tasks = repository.findAll();
        final Map<TaskStatus, List<Task>> collect = tasks.stream()
                .collect(Collectors.groupingBy(Task::getStatus));

        return (GroupingTask) collect;
    }

}