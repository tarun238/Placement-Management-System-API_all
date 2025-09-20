package com.placement.placementmanagementsystem.service;

// --- MAKE SURE THIS IMPORT IS CORRECT ---
import com.placement.placementmanagementsystem.entity.Student;
// ------------------------------------

public interface IStudentService {
    Student addStudent(Student student);
    Student updateStudent(Student student);
    Student searchStudentById(long id);
    Student searchStudentByHallTicket(long ticketNo);
    void deleteStudent(long id);
}