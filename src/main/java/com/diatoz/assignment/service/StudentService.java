package com.diatoz.assignment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diatoz.assignment.exception.ResourceNotFound;
import com.diatoz.assignment.model.Student;
import com.diatoz.assignment.repository.StudentRepository;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student createStudent(Student student) {
       
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        // Implement logic to retrieve all students
        return studentRepository.findAll();
    }

   

    public Student updateStudent(int studentId, Student updatedStudent) {
        
        Student existingStudent = studentRepository.findByStudentId(studentId);
        
        if (existingStudent != null) {
           
            existingStudent.setName(updatedStudent.getName());
           
            return studentRepository.save(existingStudent);
        }
        else
        {
        	try {
        		throw new ResourceNotFound();
        	}
        	catch(ResourceNotFound e)
        	{
        		e.getMessage();
        	}
        }
        return null; // Return null or throw an exception if student is not found
    }

    public void deleteStudent(String studentId) {
      
        studentRepository.deleteByStudentrollNo(studentId);
    }

	public Student findById(int studentId) {
		// TODO Auto-generated method stub
		return studentRepository.findByStudentId(studentId);
	}
}
