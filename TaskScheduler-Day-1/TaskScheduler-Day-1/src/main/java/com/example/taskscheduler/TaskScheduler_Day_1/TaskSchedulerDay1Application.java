package com.example.taskscheduler.TaskScheduler_Day_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TaskSchedulerDay1Application {

	public static void main(String[] args) {
		SpringApplication.run(TaskSchedulerDay1Application.class, args);
	}

}
