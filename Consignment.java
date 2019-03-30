package com.cargo.model;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Consignment {
	
	private int consignmentNo;
	private String shipmentAddress;
	private String serviceType;
	private Date dateofshipment;
	private double cost;
	private String source;
	private String destination;
	private List<Item> itemList;
	
	public int getConsignmentNo() {
		return consignmentNo;
	}
	public void setConsignmentNo(int consignmentNo) {
		this.consignmentNo = consignmentNo;
	}
	public String getShipmentAddress() {
		return shipmentAddress;
	}
	public void setShipmentAddress(String shipmentAddress) {
		this.shipmentAddress = shipmentAddress;
	}
	public String getServiceType() {
		return serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	public Date getDateofshipment() {
		return dateofshipment;
	}
	public void setDateofshipment(Date dateofshipment) {
		this.dateofshipment = dateofshipment;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public List<Item> getItemList() {
		return itemList;
	}
	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}
	public Consignment(int consignmentNo, String shipmentAddress,
			String serviceType, Date dateofshipment, double cost,
			String source, String destination, List<Item> itemList) {
		super();
		this.consignmentNo = consignmentNo;
		this.shipmentAddress = shipmentAddress;
		this.serviceType = serviceType;
		this.dateofshipment = dateofshipment;
		this.cost = cost;
		this.source = source;
		this.destination = destination;
		this.itemList = itemList;
	}
	public Consignment() {
		super();
	}

}
