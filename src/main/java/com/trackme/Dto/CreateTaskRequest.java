package com.trackme.Dto;

import com.trackme.Enums.Priority;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record CreateTaskRequest(
        @NotBlank
        String taskName,
        String taskDescription,
        LocalDate startDate,
        LocalDate endDate,

        @NotNull
        Priority taskPriority
)
{}
