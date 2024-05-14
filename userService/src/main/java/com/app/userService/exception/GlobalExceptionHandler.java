package com.app.userService.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.app.userService.payload.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {
		@ExceptionHandler
		ResponseEntity<ApiResponse> HandlerResouceNotFoundException(ResourceNotFoundException resourceNotFoundException){
			ApiResponse res = new ApiResponse();
			res.setMessage(resourceNotFoundException.getMessage());
			res.setStatus(HttpStatus.NOT_FOUND);
			res.setSuccess(true);
			return new ResponseEntity<ApiResponse>(res,HttpStatus.NOT_FOUND);
		}
}
