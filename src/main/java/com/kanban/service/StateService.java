package com.kanban.service;

import javax.xml.bind.annotation.XmlRootElement;
import org.springframework.stereotype.Service;

@Service
@XmlRootElement
public class StateService {
	private String backlog;
	private String todo;
	private String waiting;
	private String WorkInProgress;
	private String completed;
	

	public String getTodo() {
		return todo;
	}
	public void setTodo(String todo) {
		this.todo = todo;
	}
	public String getWaiting() {
		return waiting;
	}
	public void setWaiting(String waiting) {
		this.waiting = waiting;
	}
	public String getWorkInProgress() {
		return WorkInProgress;
	}
	public void setWorkInProgress(String workInProgress) {
		WorkInProgress = workInProgress;
	}
	public String getBacklog() {
		return backlog;
	}
	public void setBacklog(String backlog) {
		this.backlog = backlog;
	}
	public String getCompleted() {
		return completed;
	}
	public void setCompleted(String completed) {
		this.completed = completed;
	}

	
}
