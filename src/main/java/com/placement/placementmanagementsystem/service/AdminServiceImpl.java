package com.placement.placementmanagementsystem.service;

import com.placement.placementmanagementsystem.entity.Admin;
import com.placement.placementmanagementsystem.repository.IAdminRepository;
import com.placement.placementmanagementsystem.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // Marks this class as a Spring Service component
public class AdminServiceImpl implements AdminService {

    @Autowired // Injects the repository so we can use it
    private IAdminRepository adminRepository;

    @Override
    public Admin createAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    @Override
    public Admin getAdminById(Long id) {
        // findById returns an Optional, so we use .orElse(null) to get the admin or null
        return adminRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteAdmin(Long id) {
        adminRepository.deleteById(id);
    }
}