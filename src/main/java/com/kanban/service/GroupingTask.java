package com.kanban.service;

import java.util.List;
import java.util.Map;

import org.springframework.scheduling.config.Task;

import com.kanban.model.TaskStatus;

public class GroupingTask {

	List<Task> todoList;
    List<Task> doingList;
    List<Task> doneList;
    List<Task> backlogList;
    
    public List<Task> getTodoList() {
		return todoList;
	}

	public void setTodoList(List<Task> todoList) {
		this.todoList = todoList;
	}

	public List<Task> getDoingList() {
		return doingList;
	}

	public void setDoingList(List<Task> doingList) {
		this.doingList = doingList;
	}

	public List<Task> getDoneList() {
		return doneList;
	}

	public void setDoneList(List<Task> doneList) {
		this.doneList = doneList;
	}
	
	public List<Task> getBacklogList() {
		return backlogList;
	}

	public void setBacklogList(List<Task> backlogList) {
		this.backlogList = backlogList;
	}

    public GroupingTask(Map<TaskStatus, List<Task>> map) {
        todoList = map.get(TaskStatus.TODO);
        doingList = map.get(TaskStatus.PROGRESS);
        doneList = map.get(TaskStatus.DONE);
        backlogList = map.get(TaskStatus.BACKLOG);
    }
}
