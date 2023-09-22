package com.diatoz.assignment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diatoz.assignment.model.Teacher;
import com.diatoz.assignment.repository.TeacherRepository;

import java.util.List;

@Service
public class TeacherService {

    private final TeacherRepository teacherRepository;

    @Autowired
    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public Teacher createTeacher(Teacher teacher) {
        // You can add validation and other business logic here
        return teacherRepository.save(teacher);
    }

    public List<Teacher> getAllTeachers() {
        return teacherRepository.findAll();
    }

    
    public Teacher updateTeacher(int teacherId, Teacher updatedTeacher) {
        List<Teacher> existingTeacher = (List<Teacher>) teacherRepository.findByTeacherId(teacherId);
        Teacher teacher=existingTeacher.isEmpty() ? null : existingTeacher.get(0); ;
        teacher.setName(updatedTeacher.getName());
		return teacherRepository.save(teacher);
    }

    public void deleteTeacher(int teacherId) {
        teacherRepository.deleteTeacherById(teacherId);
    }

	
	public Teacher findById(int teacherId) {
		// TODO Auto-generated method stub
		return teacherRepository.findByTeacherId(teacherId);
	}
}

