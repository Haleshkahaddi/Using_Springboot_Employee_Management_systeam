package com.smart.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.smart.model.User;

public interface Repositry extends JpaRepository<User,Integer>{
	@Query("select u from user wher u.EmailId=:EmailId")
   public User getUserByeName(@Param("EmailId")String EmailId);
   
}
