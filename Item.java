package com.cargo.model;

import org.springframework.stereotype.Component;

@Component
public class Item {

	private int itemNo;
	private String itemName;
	private String itemCategory;
	private int weight;
	
	public int getItemNo() {
		return itemNo;
	}
	public void setItemNo(int itemNo) {
		this.itemNo = itemNo;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemCategory() {
		return itemCategory;
	}
	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public Item(int itemNo, String itemName, String itemCategory, int weight) {
		super();
		this.itemNo = itemNo;
		this.itemName = itemName;
		this.itemCategory = itemCategory;
		this.weight = weight;
	}
	
	public Item() {
		super();
	}  
	
}
