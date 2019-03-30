package com.cargo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cargo.dao.ConsignmentDAO;
import com.cargo.dao.CustomerDAO;
import com.cargo.exception.InvalidCredentialException;
import com.cargo.model.Consignment;
import com.cargo.model.Customer;

@RestController
public class CargoService {

	@Autowired
	private CustomerDAO customerDAO;
	private ConsignmentDAO consignmentDAO;

	@RequestMapping(value = "/register", method = RequestMethod.POST, 
			produces = "application/json", consumes = "application/json")
	public Customer registerCustomer(Customer customer) {
		return customerDAO.registerCustomer(customer);
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.PUT, 
			produces = "application/json", consumes = "application/json")
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerDAO.updateCustomer(customer);
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST, 
			produces = "application/json", consumes = "application/json")
	public Customer validateCustomer(Customer customer)
			throws InvalidCredentialException {
		// TODO Auto-generated method stub
		return customerDAO.validateCustomer(customer);
	}
	
	@RequestMapping(value = "/bookconsignment", method = RequestMethod.POST, 
			produces = "application/json", consumes = "application/json")
	public Customer bookConsignment(Customer customer) {
		// TODO Auto-generated method stub
		return consignmentDAO.bookConsignment(customer);
	}
	
	@RequestMapping(value = "/reports", method = RequestMethod.GET, 
			produces = "application/json", consumes = "application/json")
	public List<Consignment> genarateReport() {
		// TODO Auto-generated method stub
		return consignmentDAO.genarateReport();
	}

}
