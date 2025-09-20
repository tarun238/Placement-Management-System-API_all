package com.placement.placementmanagementsystem.repository;

import com.placement.placementmanagementsystem.entity.Placement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPlacementRepository extends JpaRepository<Placement, Long> {
    // By extending JpaRepository, we get methods like save(), findById(), findAll(), deleteById() for free!
    // No need to write any implementation code.
}