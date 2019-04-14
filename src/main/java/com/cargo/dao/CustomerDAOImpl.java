package com.cargo.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cargo.exception.InvalidCredentialException;
import com.cargo.model.Customer;

@Repository
@Transactional
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Customer registerCustomer(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("Inside DAOImpl");
		Session session = sessionFactory.openSession();
		System.out.println("Session created" + session.toString());
		Customer customer1 = (Customer) session.save(customer);
		session.close();
		return customer1;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		session.saveOrUpdate(customer);
		Customer customer1 = session.get(Customer.class, customer.getAccountNo());
		return customer1;
	}

	@Override
	public Customer validateCustomer(Customer customer) throws InvalidCredentialException {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Customer customer1 = session.get(Customer.class, customer.getAccountNo());
		return customer1;
	}

}
