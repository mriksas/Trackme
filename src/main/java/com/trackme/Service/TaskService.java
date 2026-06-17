package com.trackme.Service;

import com.trackme.Entity.Task;
import com.trackme.Repository.TaskRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class TaskService {
    private TaskRepository taskRepository;

    public Task saveTask(Task task)
    {
        return taskRepository.save(task);
    }



}
