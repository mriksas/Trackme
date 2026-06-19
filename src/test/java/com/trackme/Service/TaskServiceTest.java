package com.trackme.Service;

import com.trackme.Dto.CreateTaskRequest;
import com.trackme.Entity.Task;
import com.trackme.Interface.TaskMapper;
import com.trackme.Repository.TaskRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class TaskServiceTest {

    @Mock
    private TaskRepository taskRepository;

    @InjectMocks
    private  TaskService taskService;
    @Mock
    private TaskMapper taskMapper;

    @Test
    void testAddTask()
    {
        // given
        CreateTaskRequest request = new CreateTaskRequest("Test name", "Test", null,null,null);
        Task task = new Task();
        task.setTaskName("Test name");

        when(taskMapper.toTaskEntity(request)).thenReturn(task);
        when(taskRepository.save(any(Task.class))).thenReturn(task);

        // when
        Task addedTask = taskService.saveTask(request);

        // then
        assertNotNull(addedTask);
        assertEquals("Test name", addedTask.getTaskName());

        verify(taskRepository, times(1)).save(any(Task.class));

    }

}
