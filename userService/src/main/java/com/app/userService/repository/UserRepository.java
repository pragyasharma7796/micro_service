package com.app.userService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.userService.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
