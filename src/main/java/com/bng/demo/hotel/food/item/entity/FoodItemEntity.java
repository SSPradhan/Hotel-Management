package com.bng.demo.hotel.food.item.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Food_Items")
public class FoodItemEntity implements Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long itemId;
	
	@Column(name = "item name")
	private String itemName;
	
	@Column(name = "item price")
	private long itemPrice;
	
	@Column(name = "item ingradients")
	private String itemIngradients;
	
	
	public FoodItemEntity() {
		super();
	}


	public FoodItemEntity(long itemId, String itemName, long itemPrice, String itemIngradients) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemIngradients = itemIngradients;
	}


	public long getItemId() {
		return itemId;
	}


	public void setItemId(long itemId) {
		this.itemId = itemId;
	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public long getItemPrice() {
		return itemPrice;
	}


	public void setItemPrice(long itemPrice) {
		this.itemPrice = itemPrice;
	}


	public String getItemIngradients() {
		return itemIngradients;
	}


	public void setItemIngradients(String itemIngradients) {
		this.itemIngradients = itemIngradients;
	}


	@Override
	public String toString() {
		return "FoodItemEntity [itemId=" + itemId + ", itemName=" + itemName + ", itemPrice=" + itemPrice
				+ ", itemIngradients=" + itemIngradients + "]";
	}
	
	
	
}
