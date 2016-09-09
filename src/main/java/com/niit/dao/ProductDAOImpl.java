package com.niit.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.models.Product;


	@Repository("productDAO")
	public class ProductDAOImpl implements ProductDAO {

		@Autowired
		private SessionFactory sessionFactory;
		
		public void saveOrUpdate(Product product) {
			
			Session session=sessionFactory.openSession();
			session.save(product);
			Transaction t=session.beginTransaction();
			t.commit();
			session.close();
		}

		public void delete(Product product) {
			// TODO Auto-generated method stub
			
		}

		public Product get(int pname) {
			// TODO Auto-generated method stub
			return null;
		}

}
