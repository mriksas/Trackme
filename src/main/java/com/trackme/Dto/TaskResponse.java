package com.trackme.Dto;

import com.trackme.Enums.Priority;
import com.trackme.Enums.Status;
import java.time.LocalDate;

public record TaskResponse(
        Long taskId,
        String taskName,
        String taskDescription,
        LocalDate startDate,
        LocalDate endDate,
        Priority taskPriority,
        Status taskStatus
) {}
