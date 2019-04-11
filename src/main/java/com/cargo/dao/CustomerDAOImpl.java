package com.cargo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cargo.exception.InvalidCredentialException;
import com.cargo.model.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public Customer registerCustomer(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("Inside DAOImpl");
		Session session = sessionFactory.getCurrentSession();
		System.out.println("Session created" + session.toString());
		//session.save(customer);
		return null;
	}
	
	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer validateCustomer(Customer customer)
			throws InvalidCredentialException {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
