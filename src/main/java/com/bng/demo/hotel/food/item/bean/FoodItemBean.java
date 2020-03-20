package com.bng.demo.hotel.food.item.bean;

public class FoodItemBean 
{
	private long itemId;
	private String itemName;
	private long itemPrice;
	private String itemIngradients;
	
	
	public FoodItemBean() {
		super();
	}


	public FoodItemBean(long itemId, String itemName, long itemPrice, String itemIngradients) {
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
		return "FoodItemBean [itemId=" + itemId + ", itemName=" + itemName + ", itemPrice=" + itemPrice
				+ ", itemIngradients=" + itemIngradients + "]";
	}
	
	
	

}
