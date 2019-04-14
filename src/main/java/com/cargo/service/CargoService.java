package com.cargo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

	@GetMapping(value = "/register")
	public Customer registerCustomer(Customer customer) {
		return customerDAO.registerCustomer(customer);
	}

	@PutMapping(value = "/update", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerDAO.updateCustomer(customer);
	}

	@PostMapping(value = "/login", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Customer validateCustomer(Customer customer) throws InvalidCredentialException {
		// TODO Auto-generated method stub
		return customerDAO.validateCustomer(customer);
	}

	@PostMapping(value = "/bookconsignment", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Customer bookConsignment(Customer customer) {
		// TODO Auto-generated method stub
		return consignmentDAO.bookConsignment(customer);
	}

	@GetMapping(value = "/reports", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public List<Consignment> genarateReport() {
		// TODO Auto-generated method stub
		return consignmentDAO.genarateReport();
	}

}
