package com.diatoz.assignment.service;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
import com.diatoz.assignment.model.Admin;
import com.diatoz.assignment.repository.AdminRepository;

import java.util.List;

@Service
public class AdminService implements UserDetailsService {

    private final AdminRepository adminRepository;

    @Autowired
    Admin admin;
    
    @Autowired
    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    public Admin createAdmin(Admin admin) {
        																			
        return adminRepository.save(admin);
    }

    public List<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }

   
    public Admin updateAdmin(int adminId, Admin updatedAdmin) {
        Admin existingAdmin = adminRepository.findById(adminId).orElse(null);
        if (existingAdmin != null) {
            																	
            existingAdmin.setUsername(updatedAdmin.getUsername());
            																					
            return adminRepository.save(existingAdmin);
        }
        return null; 						// Return null or throw an exception if admin is not found
    }

    public void deleteAdmin(int adminId) {
        adminRepository.deleteById(adminId);
    }

	public Admin getAdminById(int adminId) {

		return adminRepository.getById(adminId);
	}

	public UserDetails loadUserByUsername(String userName) {
	    UserDetails userDetails = User.builder()
	            .username(admin.getUsername())
	            .password(admin.getPassword())
	            .roles("ADMIN") // Assign appropriate roles
	            .build();
	    return userDetails;
	}
	
	
}

