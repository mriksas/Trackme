package com.trackme.Interface;
import com.trackme.Dto.CreateTaskRequest;
import com.trackme.Dto.TaskResponse;
import com.trackme.Entity.Task;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TaskMapper {

    Task toTaskEntity(CreateTaskRequest createTaskRequest);

    TaskResponse toResponse(Task task);

    List<TaskResponse> toResponseList(List<Task> taskList);

}
