package com.cargo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "item")
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "itemNo")
	private int itemNo;
	@Column(name = "itemName")
	private String itemName;
	@Column(name = "itemCategory")
	private String itemCategory;
	private int weight;
	@Column(name = "consignmentNo")
	private int consignmentNo;

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

	public int getConsignmentNo() {
		return consignmentNo;
	}

	public void setConsignmentNo(int consignmentNo) {
		this.consignmentNo = consignmentNo;
	}

	public Item(int itemNo, String itemName, String itemCategory, int weight, int consignmentNo) {
		super();
		this.itemNo = itemNo;
		this.itemName = itemName;
		this.itemCategory = itemCategory;
		this.weight = weight;
		this.consignmentNo = consignmentNo;
	}

	public Item() {
		super();
	}

}
