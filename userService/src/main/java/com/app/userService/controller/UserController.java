package com.app.userService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.userService.entities.User;
import com.app.userService.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	UserService service;
	
	//create
	@PostMapping
	ResponseEntity<User> createUser(@RequestBody User user) {
		User user1 = service.saveUser(user);
		return new ResponseEntity<User>(user1,HttpStatus.CREATED);
	}
	 //Get All User
	@GetMapping
	ResponseEntity<List<User>> getAllUser(){
		List<User> lu = service.getAllUser();
		return new ResponseEntity<List<User>>(lu,HttpStatus.OK);
	}
	@GetMapping("/{id}")
	 ResponseEntity<User> getUserById(@PathVariable int id){
		User user = service.getUserById(id);
		return new ResponseEntity<User>(user,HttpStatus.OK);

	}
	
}
