package com.placement.placementmanagementsystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "students")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    
    // Note: Based on your diagram, 'college' is a complex object.
    // For now, we'll store its name as a simple String to get started.
    // We will build the full relationship later.
    private String college; 

    private long roll;
    private String qualification;
    private String course;
    private int year;

    // The diagram spells it 'hallTicketNo', so we match that.
    private long hallTicketNo; 

    // Note: We will add the 'Certificate' relationship in a later step.
}