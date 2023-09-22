package com.diatoz.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.diatoz.assignment.model.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Integer>{
	
	@Query(value="select * from teacher where name=?1 or email=?2",nativeQuery = true)
	Teacher validate(String name,String email);

	@Query(value="delete from teacher where id=?1",nativeQuery = true)
	void deleteTeacherById(int id);

	@Query(value="select * from teacher where teacherId=?1",nativeQuery = true)
	Teacher findByTeacherId(int teacherId);




}
