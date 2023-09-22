package com.diatoz.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.diatoz.assignment.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {

	@Query(value="select * from admin where id=?1 or name=?2",nativeQuery = true)
	Admin validate(String name,String email);

	@Query(value="select * from admin where username=?1",nativeQuery = true)
	Admin findByUsername(String username);

	@Query(value="delete from admin where adminId=?1",nativeQuery = true)
	void deleteById(int adminId);

}
