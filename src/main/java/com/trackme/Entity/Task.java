package com.trackme.Entity;
import com.trackme.Enums.Priority;
import com.trackme.Enums.Status;

import java.time.LocalDate;

public class Task {

    private Long taskId;
    private String taskName;
    private String taskDescription;
    private LocalDate startDate;
    private LocalDate endDate;
    private Priority taskPriority;
    private Status taskStatus;

    Task(Long taskId, String taskName, String taskDescription, LocalDate startDate, LocalDate endDate, Priority taskPriority, Status taskStatus)
    {
        this.taskId = taskId;
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.startDate = startDate;
        this.endDate = endDate;
        this.taskPriority = taskPriority;
        this.taskStatus = taskStatus;
    }



}
