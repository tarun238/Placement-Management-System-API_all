package com.placement.placementmanagementsystem.repository;

import com.placement.placementmanagementsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    // Spring Data JPA automatically creates the query from the method name!
    Optional<Student> findByHallTicketNo(long hallTicketNo);
}