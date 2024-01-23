package com.todolistapplication.backend.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Task {
	
	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	@Column(name="id")
	private Long id;
	@Column(name="taskName")
	private String taskName;
	@Column(name="dueDate")
	private LocalDate dueDate;
	@Column(name="completed")
	private Boolean completed;
	public Task(Long id, String taskName, LocalDate dueDate, Boolean completed) {
		super();
		this.id = id;
		this.taskName = taskName;
		this.dueDate = dueDate;
		this.completed = completed;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public LocalDate getDueDate() {
		return dueDate;
	}
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	public Boolean getCompleted() {
		return completed;
	}
	public void setCompleted(Boolean completed) {
		this.completed = completed;
	}
	


}