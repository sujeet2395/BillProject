package com.learn;

public class Item {
	private double price;
	private double discount;
	public Item(double price, double discount) {
		super();
		this.price = price;
		this.discount = discount;
	}
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	@Override
	public String toString() {
		return "Item [price=" + price + ", discount=" + discount + "]";
	}
	
}
