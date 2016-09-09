package com.niit.service;

import org.springframework.stereotype.Service;

import com.niit.models.Product;

@Service
public interface ProductServiceDAO {

	public void ProductRegistration(Product product);

}
