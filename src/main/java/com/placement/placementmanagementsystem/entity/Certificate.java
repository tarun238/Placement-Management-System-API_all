package com.placement.placementmanagementsystem.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "certificates")
public class Certificate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int year;

    // Add the new field here
    private String certificateName;

    // We can add a relationship to College later
    private String college;
}