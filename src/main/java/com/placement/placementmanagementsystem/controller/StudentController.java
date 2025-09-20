package com.placement.placementmanagementsystem.controller;

// --- MAKE SURE THESE IMPORTS ARE CORRECT ---
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.placement.placementmanagementsystem.entity.Student;
import com.placement.placementmanagementsystem.service.IStudentService;
// -----------------------------------------

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private IStudentService studentService;

    // 1. API to add a new student (CREATE)
    @PostMapping("/")
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    // 2. API to get a student by their ID (READ)
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable long id) {
        return studentService.searchStudentById(id);
    }

    // 3. API to update a student (UPDATE)
    @PutMapping
    public Student updateStudent(@RequestBody Student student) {
        return studentService.updateStudent(student);
    }

    // 4. API to delete a student (DELETE)
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable long id) {
        studentService.deleteStudent(id);
    }

    // 5. Custom API to get a student by their Hall Ticket Number
    @GetMapping("/hallticket/{ticketNo}")
    public Student getStudentByHallTicket(@PathVariable long ticketNo) {
        return studentService.searchStudentByHallTicket(ticketNo);
    }
}