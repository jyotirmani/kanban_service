package com.kanban.service;

import java.util.List;

import org.springframework.scheduling.config.Task;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

@CrossOrigin(methods = {
    RequestMethod.POST,RequestMethod.PUT,
    RequestMethod.DELETE, RequestMethod.GET
})
public interface TaskRepository<Task, Long>{

	List<Task> findAll();
}