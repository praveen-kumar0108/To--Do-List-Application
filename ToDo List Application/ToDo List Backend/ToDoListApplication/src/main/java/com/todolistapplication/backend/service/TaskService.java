package com.todolistapplication.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.todolistapplication.backend.entity.Task;

public interface TaskService {
	Task createTask (Task task);
	List<Task> getAllTasks();
	void deleteTask (Long id);
	Task updateTask(Long id, Task task);
	Optional<Task> getTaskById(Long id);
	
	

}



/*List<User> getAllUser();
User createUser (User user);
Optional<User> getUserById(Long id);
void deleteUser (Long id);
User updateUser(Long id, User user);*/