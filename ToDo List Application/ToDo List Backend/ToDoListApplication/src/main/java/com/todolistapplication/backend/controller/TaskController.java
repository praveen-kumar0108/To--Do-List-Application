package com.todolistapplication.backend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.todolistapplication.backend.entity.Task;
import com.todolistapplication.backend.service.TaskService;

@RestController
@RequestMapping("/api/task")
public class TaskController {
	
	@Autowired
	private TaskService taskServ;
	@PostMapping("/addtask")
	public Task createask(@RequestBody Task task) {
		return taskServ.createTask(task);
	}
	@GetMapping("/displaytasks")
	public List<Task> getAllTasks(){
		return taskServ.getAllTasks();
	}
	@DeleteMapping("/deletetask/{id}")
	public String deleteTaskById(@PathVariable Long id) {
		taskServ.deleteTask(id);
		return "Deleted";
	}
	@PutMapping("/updatetask/{id}")
	public Task updateTask(@PathVariable Long id, @RequestBody Task task) {
		return taskServ.updateTask(id, task);
	}
	@GetMapping("/getTaskdetails/{id}")
	public Optional<Task> getUserById(@PathVariable Long id) {
		return taskServ.getTaskById(id);
	}

}
