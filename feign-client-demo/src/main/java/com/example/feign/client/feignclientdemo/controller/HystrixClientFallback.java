package com.example.feign.client.feignclientdemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.feign.client.feignclientdemo.model.Product;

@Component
public class HystrixClientFallback implements ProductServiceClient {

	@Override
	public List<Product> getAllProducts() {
		List<Product> products = new ArrayList<>();
		Product product = new Product(1, "product-backup", 12.0);
		products.add(product);
		return products;
	}

	@Override
	public Product getProduct(int productId) {
		Product product = new Product(1, "product-backup", 12.0);
		return product;
	}
}
