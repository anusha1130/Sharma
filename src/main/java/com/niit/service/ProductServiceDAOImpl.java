package com.niit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.dao.ProductDAO;
import com.niit.models.Product;


@Repository("productServiceDAO")
public class ProductServiceDAOImpl implements ProductServiceDAO{

	@Autowired
	private ProductDAO productDAO;
	
	public void ProductRegistration(Product product) {
		productDAO.saveOrUpdate(product);
	}
}
