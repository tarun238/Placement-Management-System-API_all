package com.placement.placementmanagementsystem.controller;

import com.placement.placementmanagementsystem.entity.Admin;
import com.placement.placementmanagementsystem.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController // Tells Spring this is a controller that returns JSON
@RequestMapping("/api/admins") // Base URL for all endpoints in this class
public class AdminController {

    @Autowired
    private AdminService adminService;

    // POST: Create a new admin
    @PostMapping("/")
    public Admin createAdmin(@RequestBody Admin admin) {
        return adminService.createAdmin(admin);
    }

    // GET: Retrieve an admin by their ID
    @GetMapping("/{id}")
    public ResponseEntity<Admin> getAdminById(@PathVariable Long id) {
        Admin admin = adminService.getAdminById(id);
        if (admin == null) {
            return ResponseEntity.notFound().build(); // Return 404 Not Found
        }
        return ResponseEntity.ok(admin); // Return 200 OK with the admin
    }

    // DELETE: Remove an admin by their ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAdmin(@PathVariable Long id) {
        adminService.deleteAdmin(id);
        return ResponseEntity.noContent().build(); // Return 204 No Content
    }
}