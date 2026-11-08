package com.example.TaskTrack_API.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class TaskController {

    @GetMapping("/api/tasks")
    public List<String> getTasks() {
        return List.of(
            "Task 1: Learn Docker & Git", 
            "Task 2: Build Spring Boot API", 
            "Task 3: Submit Assignment #2"
        );
    }
}