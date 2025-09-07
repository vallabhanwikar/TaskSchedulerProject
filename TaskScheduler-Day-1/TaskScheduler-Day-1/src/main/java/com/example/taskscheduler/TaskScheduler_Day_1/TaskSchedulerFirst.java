package com.example.taskscheduler.TaskScheduler_Day_1;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class TaskSchedulerFirst {
    private int executionCount = 0;
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    private long startTime;

    @EventListener(ApplicationReadyEvent.class)
    public void onApplicationReady() {
        startTime = System.currentTimeMillis();
        System.out.println("Starting Scheduler " + getCurrentTimestamp());
    }

    @Scheduled(fixedRate = 10000)
    public void executeTask() {
        LocalDateTime now = LocalDateTime.now();

        long currentTime = System.currentTimeMillis();
        long elapsedTime = (currentTime - startTime)/1000;

        if(elapsedTime > 60)
        {
            System.out.println("Execution time is " + elapsedTime + " seconds");
            System.out.println("Exiting now..."+ getCurrentTimestamp());
            System.exit(0);
            return;
        }

        executionCount++;

        System.out.println("Execution Count: " + executionCount);

    }
    private String getCurrentTimestamp() {
        return LocalDateTime.now().format(formatter);
    }
}
