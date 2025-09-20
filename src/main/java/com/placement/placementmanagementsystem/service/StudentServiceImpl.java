package com.placement.placementmanagementsystem.service;

// --- MAKE SURE THESE IMPORTS ARE CORRECT ---
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.placement.placementmanagementsystem.entity.Student;
import com.placement.placementmanagementsystem.repository.StudentRepository;
// -----------------------------------------

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student searchStudentById(long id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public Student searchStudentByHallTicket(long ticketNo) {
        return studentRepository.findByHallTicketNo(ticketNo).orElse(null);
    }

    @Override
    public void deleteStudent(long id) {
        studentRepository.deleteById(id);
    }
}