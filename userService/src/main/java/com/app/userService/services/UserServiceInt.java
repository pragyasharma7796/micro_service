package com.app.userService.services;

import java.util.List;

import com.app.userService.entities.User;

public interface UserServiceInt {
	//Save User
	User saveUser(User user);
	//get All user
	List<User> getAllUser();
	
	//get User By Id 
	
	User getUserById(int id);
	
	// delete user by id
	
	void deleteUser(int id);
	
	// update user by id
	User updateUser(User user); 
	
}
