package com.anveta.demo.service;

import com.anveta.demo.domain.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;



public interface TaskService {

    Iterable<Task> listTasks();

    Task save(Task task);
}
