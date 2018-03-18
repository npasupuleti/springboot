package com.anveta.demo.service;

import com.anveta.demo.domain.Task;
import com.anveta.demo.repository.TaskRepository;


public class TaskServiceImpl implements TaskService{


    private TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task save(Task task) {
        return this.taskRepository.save(task);
                ;
    }

    @Override
    public Iterable<Task> listTasks() {
        return this.taskRepository.findAll();
    }
}
