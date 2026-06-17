package com.trackme.Entity;
import com.trackme.Enums.Priority;
import com.trackme.Enums.Status;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long taskId;
    private String taskName;
    private String taskDescription;
    private LocalDate startDate;
    private LocalDate endDate;

    @Enumerated(EnumType.STRING)
    private Priority taskPriority;

    @Enumerated(EnumType.STRING)
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
