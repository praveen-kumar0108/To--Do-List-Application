package com.todolistapplication.backend.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import com.todolistapplication.backend.entity.Task;
import com.todolistapplication.backend.repository.TaskRepository;
import com.todolistapplication.backend.service.TaskService;

@Service
public class TaskServiceImpl implements TaskService  {
	
	@Autowired
	private TaskRepository taskRepo;

	@Override
	public Task createTask(Task task) {
		// TODO Auto-generated method stub
		return taskRepo.save(task);
	}

	@Override
	public List<Task> getAllTasks() {
		// TODO Auto-generated method stub
		return taskRepo.findAll();
	}

	@Override
	public void deleteTask(Long id) {
		// TODO Auto-generated method stub
		taskRepo.deleteById(id);
	}

	@Override
	public Task updateTask(Long id, Task task) {
		Optional<Task> optionalTask = taskRepo.findById(id);
		if (optionalTask.isPresent()) {
	        Task existingTask = optionalTask.get();
	        existingTask.setTaskName(task.getTaskName());
	        existingTask.setDueDate(task.getDueDate());
	        return taskRepo.save(existingTask);
	    } 
		else {
	        return null;
	    }
	}

	@Override
	public Optional<Task> getTaskById(Long id) {
		// TODO Auto-generated method stub
		return taskRepo.findById(id);
	}
}
/*Optional<Task> optionalTask = taskRepo.findById(id);
		if (optionalTask.isPresent()) {
	        Task existingTask = optionalTask.get();
	        existingTask.settaskName(task.getTaskName());
	        existingTask.setdueDate(task.getDueDate());

	        return taskRepo.save(existingTask);
	    } else {
	        return null;
	    }*/

