package com.trackme.Service;

import com.trackme.Dto.CreateTaskRequest;
import com.trackme.Entity.Task;
import com.trackme.Interface.TaskMapper;
import com.trackme.Repository.TaskRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class TaskService {
    private TaskRepository taskRepository;
    private TaskMapper taskMapper;
    // Adding new task to db
    public Task saveTask(CreateTaskRequest createTaskRequest)
    {
        var task = taskMapper.toTaskEntity(createTaskRequest);
        return taskRepository.save(task);
    }

    public List<Task> getAllTasks()
    {
        return taskRepository.findAll();
    }

}
