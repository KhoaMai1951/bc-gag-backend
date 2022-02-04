package com.techgeeknext.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techgeeknext.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
 
}