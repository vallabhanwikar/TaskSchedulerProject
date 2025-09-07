package com.example.taskscheduler.TaskScheduler_Day_1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(properties = {
        "spring.task.scheduling.pool.size=1"
})
class TaskSchedulerDay1ApplicationTests {

    void contextLoads() {
	}

}
