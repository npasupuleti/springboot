package com.anveta.demo;

import com.anveta.demo.domain.Task;
import com.anveta.demo.service.TaskService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(TaskService taskService){
return args -> {
    taskService.save(new Task(id: 1L, name: "create SpringBootApplication" , LocalDate.now(), completed:true) );
    taskService.save(new Task(id: 2L, name: "create SpringBootPackages" , LocalDate.now().plus(1, ChronoUnit.DAYS), completed:false));
    taskService.save(new Task(id: 3L, name: "create SpringBootStructure" , LocalDate.now(), completed:true));


};





	}
}
