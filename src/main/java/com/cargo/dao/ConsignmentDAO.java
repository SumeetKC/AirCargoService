package com.cargo.dao;

import java.util.List;

import com.cargo.model.Consignment;
import com.cargo.model.Customer;

public interface ConsignmentDAO {
	
	Customer bookConsignment (Customer customer);
	List<Consignment> genarateReport();

}
