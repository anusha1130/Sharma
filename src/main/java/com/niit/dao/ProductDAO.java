package com.niit.dao;

import com.niit.models.Product;

public interface ProductDAO {

	public void saveOrUpdate(Product product);

	public void delete(Product product);

	public Product get(int pname);
}
