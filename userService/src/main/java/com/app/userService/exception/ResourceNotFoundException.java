package com.app.userService.exception;

public class ResourceNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	public ResourceNotFoundException() {
		 super("Resource not found !!");
	}
	public ResourceNotFoundException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}

	
}
