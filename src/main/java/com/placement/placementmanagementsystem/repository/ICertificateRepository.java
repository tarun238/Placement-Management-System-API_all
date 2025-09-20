package com.placement.placementmanagementsystem.repository;

import com.placement.placementmanagementsystem.entity.Certificate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICertificateRepository extends JpaRepository<Certificate, Long> {
    // Just like before, Spring Data JPA provides all the necessary database
    // methods (save, findById, findAll, deleteById) automatically.
}