package com.niit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.niit.models.Product;
import com.niit.service.ProductServiceDAO;



public class ProductController {

	@RestController
	public class UsersRest {

		@Autowired
		ProductServiceDAO productServiceDAO;
		
		@RequestMapping(value = ("/Register"), method = RequestMethod.POST)
		public void RegisterUser(@RequestBody Product product) 
		{
			productServiceDAO.ProductRegistration(product);
		}
}
}
