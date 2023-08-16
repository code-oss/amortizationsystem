package com.code.loanapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.code.loanapp.model.AdminModel;

@Repository
public interface AdminModelRep extends JpaRepository<AdminModel ,Long> {
    @Query("from admin_model where username=?1")
	public List<AdminModel> findByID(String username);
	
	@Query("from admin_model where username=?1 and password=?2")
    public AdminModel findAdminByUsernamePassword(String username,String password);
    
}
