package com.anveta.demo.controller;


import com.anveta.demo.domain.Task;
import com.anveta.demo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {


    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping(value = {"","/"})
    public Iterable<Task> listTask(){

        return  taskService.listTasks();

    }

        @PostMapping("/save")

                public Task saveTask(@RequestBody Task task){
            return  this.taskService.save(task);
        }

}
