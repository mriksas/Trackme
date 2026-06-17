package com.trackme.Controller;

import com.trackme.Entity.Task;
import com.trackme.Service.TaskService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/tasks")
@AllArgsConstructor
@RestController
public class TaskController {
    private TaskService taskService;

    @PostMapping
    public Task addTask(@RequestBody Task task)
    {
        return taskService.saveTask(task);
    }
}
