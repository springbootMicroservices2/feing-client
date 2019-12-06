package com.example.feign.client.feignclientdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.feign.client.feignclientdemo.model.Product;

@RestController
public class AppController {

	@Autowired
	ProductServiceClient productServiceClient;

	@GetMapping("/fetchProducts")
	public ResponseEntity<?> fetchProducts() {

		return ResponseEntity.ok(productServiceClient.getAllProducts());
	}

	@GetMapping("/fetchProduct/{id}")
	public ResponseEntity<?> fetchProduct(@PathVariable int id) {
		Product product = productServiceClient.getProduct(id);

		return ResponseEntity.ok(product);
	}

}
