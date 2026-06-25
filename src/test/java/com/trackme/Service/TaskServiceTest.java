package com.trackme.Service;

import com.trackme.Dto.CreateTaskRequest;
import com.trackme.Dto.TaskResponse;
import com.trackme.Entity.Task;
import com.trackme.Enums.Priority;
import com.trackme.Enums.Status;
import com.trackme.Interface.TaskMapper;
import com.trackme.Repository.TaskRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

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
    void shouldAddTask()
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

    @Test
    void shouldGetAllTasks()
    {
        List<Task> tasks = List.of(new Task());
        List<TaskResponse> responses = List.of(new TaskResponse(1L,"", "",null, null, Priority.HIGH, Status.TODO));
        when(taskRepository.findAll()).thenReturn(tasks);
        when(taskMapper.toResponseList(tasks)).thenReturn(responses);

        //when
        var listOfTasks = taskService.getAllTasks();

        // then
        assertNotNull(listOfTasks);
        verify(taskRepository, times(1)).findAll();

    }

    @Test
    void shouldDeleteTaskById()
    {
        Long id = 1L;
        when(taskRepository.existsById(id)).thenReturn(true);

        // when
        taskService.deleteById(id);

        // then
        verify(taskRepository).existsById(id);
        verify(taskRepository).existsById(id);

    }
}
