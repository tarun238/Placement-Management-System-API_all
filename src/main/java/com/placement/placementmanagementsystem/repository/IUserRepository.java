package com.placement.placementmanagementsystem.repository;

import com.placement.placementmanagementsystem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Long> {
}