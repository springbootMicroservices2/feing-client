package com.example.feign.client.feignclientdemo.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppExceptionHandler {
	@ResponseBody
	@ExceptionHandler(value = ProductNotFoundException.class)
	public ResponseEntity<?> handleException(ProductNotFoundException exception) {
		System.out.println("Abhishek in RestController advice");
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exception.getMessage());
	}
}
