package com.placement.placementmanagementsystem.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Data // Lombok annotation to create getters, setters, etc.
@Entity
@Table(name = "placements")
public class Placement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // We can add a relationship to College later if needed
    // @ManyToOne
    // @JoinColumn(name = "college_id")
    // private College college;

    private String college; // For now, let's keep it simple as a String

    private LocalDate date;

    private String qualification;

    private int year;
}