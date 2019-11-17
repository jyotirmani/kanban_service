package com.kanban.contoller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kanban.service.StateService;

@RestController
@RequestMapping("/rest/getStateData")
public class KanbanController {
	
	Logger logger = LoggerFactory.getLogger(KanbanController.class);
	
	@Autowired
	private  StateService serviceState;
	
	@GetMapping
	public StateService getStateData() {
		
	logger.info("Setting Kanban service state info");
	
	serviceState.setBacklog("backlog story");
	serviceState.setWorkInProgress("workInProgress");
	serviceState.setTodo("todo");
	serviceState.setWaiting("waiting");
	serviceState.setCompleted("completed");
	
	return serviceState;
	}
	
}
