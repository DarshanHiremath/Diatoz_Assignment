package com.diatoz.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.diatoz.assignment.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

	@Query(value="select * from student where name=?1 or phno=?2",nativeQuery = true)
	Student validate(String name,String phno);

	@Query(value="delete from student")
	Student deleteByStudentrollNo(String rollNo);
	
	@Query(value="select * from student where id=?1",nativeQuery = true)
	Student findByStudentId(int id);
}
