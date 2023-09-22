package com.diatoz.assignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.diatoz.assignment.model.Teacher;
import com.diatoz.assignment.service.TeacherService;

import java.util.List;

@RestController
@RequestMapping("/api/teachers")
public class TeacherController {

    private final TeacherService teacherService;

    @Autowired
    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    // Endpoint to create a new teacher
    @PostMapping("/create")
    public ResponseEntity<Teacher> createTeacher(@RequestBody Teacher teacher) {
        Teacher createdTeacher = teacherService.createTeacher(teacher);
        return ResponseEntity.ok(createdTeacher);
    }

    // Endpoint to get a list of all teachers
    @GetMapping("/list")
    public ResponseEntity<List<Teacher>> getAllTeachers() {
        List<Teacher> teachers = teacherService.getAllTeachers();
        return ResponseEntity.ok(teachers);
    }

    // Endpoint to get teacher details by ID
    @GetMapping("/{teacherId}")
    public ResponseEntity<Teacher> getTeacherById(@PathVariable int teacherId) {
        Teacher teacher = teacherService.findById(teacherId);
        return ResponseEntity.ok(teacher);
    }

    // Endpoint to update teacher information
    @PutMapping("/{teacherId}")
    public ResponseEntity<Teacher> updateTeacher(@PathVariable int teacherId, @RequestBody Teacher updatedTeacher) {
        Teacher teacher = teacherService.updateTeacher(teacherId, updatedTeacher);
        return ResponseEntity.ok(teacher);
    }

    // Endpoint to delete a teacher by ID
    @DeleteMapping("/{teacherId}")
    public ResponseEntity<Void> deleteTeacher(@PathVariable int teacherId) {
        teacherService.deleteTeacher(teacherId);
        return ResponseEntity.noContent().build();
    }
}

