package com.placement.placementmanagementsystem.repository;

import com.placement.placementmanagementsystem.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAdminRepository extends JpaRepository<Admin, Long> {
    // JpaRepository<EntityType, PrimaryKeyType>
}