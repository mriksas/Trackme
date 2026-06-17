package com.trackme.Entity;
import com.trackme.Enums.Priority;
import com.trackme.Enums.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long taskId;

    @Setter
    private String taskName;

    @Setter
    private String taskDescription;

    @Setter
    private LocalDate startDate;

    @Setter
    private LocalDate endDate;

    @Enumerated(EnumType.STRING)
    @Setter
    private Priority taskPriority;

    @Enumerated(EnumType.STRING)
    @Setter
    private Status taskStatus;
    
}
