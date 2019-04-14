package com.cargo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int accountNo;
	private String customerName;
	private long mobileNo;
	private String emailId;
	private String address;
	private String password;
	@Transient
	private List<Consignment> bookingList;

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Consignment> getBookingList() {
		return bookingList;
	}

	public void setBookingList(List<Consignment> bookingList) {
		this.bookingList = bookingList;
	}

	public Customer(int accountNo, String customerName, long mobileNo, String emailId, String address, String password,
			List<Consignment> bookingList) {
		super();
		this.accountNo = accountNo;
		this.customerName = customerName;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
		this.address = address;
		this.password = password;
		this.bookingList = bookingList;
	}

	public Customer() {
		super();
	}

}
