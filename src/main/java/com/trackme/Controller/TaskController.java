package com.trackme.Controller;

import com.trackme.Dto.CreateTaskRequest;
import com.trackme.Entity.Task;
import com.trackme.Service.TaskService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/tasks")
@AllArgsConstructor
@RestController
public class TaskController {
    private TaskService taskService;

    @PostMapping
    public Task addTask(@RequestBody CreateTaskRequest createTaskRequest)
    {
        return taskService.saveTask(createTaskRequest);
    }

}
