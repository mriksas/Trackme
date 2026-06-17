package com.trackme.Controller;

import com.trackme.Entity.Task;
import com.trackme.Service.TaskService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@AllArgsConstructor
public class TaskController {
    private TaskService taskService;

    public Task addTask(@RequestBody Task task)
    {
        return taskService.saveTask(task);
    }
}
