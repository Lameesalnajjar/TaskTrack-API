package com.example.tasktrack.controller;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    // قائمة المهام
    private static final List<String> tasks = new ArrayList<>();

    @GetMapping
    public List<String> getTasks() {
        return tasks;
    }

    @PostMapping
    public String addTask(@RequestBody TaskRequest request) {
        if (request != null && request.getTitle() != null && !request.getTitle().trim().isEmpty()) {
            tasks.add(request.getTitle().trim());
            return "Success";
        }
        return "Error";
    }

    @DeleteMapping("/{id}")
    public String deleteTask(@PathVariable int id) {
        if (id >= 0 && id < tasks.size()) {
            tasks.remove(id);
            return "Deleted";
        }
        return "Error";
    }

    public static class TaskRequest {
        private String title;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
}