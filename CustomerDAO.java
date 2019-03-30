package com.cargo.dao;

import com.cargo.exception.InvalidCredentialException;
import com.cargo.model.Customer;

public interface CustomerDAO {
	
	Customer registerCustomer(Customer customer);
	Customer updateCustomer(Customer customer);
	Customer validateCustomer(Customer customer ) throws InvalidCredentialException;

}
