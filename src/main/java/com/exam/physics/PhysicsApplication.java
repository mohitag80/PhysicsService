package com.exam.physics;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PhysicsApplication {

    private static final Logger logger = LogManager.getLogger(PhysicsApplication.class);

    public static void main(String[] args) {
        logger.info("Starting Physics Exam Service v1.0");
        SpringApplication.run(PhysicsApplication.class, args);
        logger.info("Physics Exam Service started successfully on port 8081");
    }
}
