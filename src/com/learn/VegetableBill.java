package com.learn;

import java.util.ArrayList;
import java.util.List;

public class VegetableBill {
	private Employee clerk;
	private double total;
	private double discounted;
	protected List<Item> veges;
	private boolean preferred;
	
	public VegetableBill(Employee clerk, boolean preferred)
	{
		this.clerk=clerk;
		total=0.0;
		discounted=0.0;
		this.preferred=preferred;
		veges=new ArrayList<>();
	}
	
	public boolean isPreferred() {
		return preferred;
	}

	public void setPreferred(boolean preferred) {
		this.preferred = preferred;
	}

	public void add(Item i)
	{
		veges.add(i);
	}
	public double getTotal()
	{
		total=0;
		for(Item item: veges)
		{
			total+=item.getPrice()-(preferred?item.getDiscount():0.0);
		}
		return total;
	}
	public double getDiscounted()
	{	discounted=0;
		for(Item item: veges)
		{
			discounted+=(preferred)?item.getDiscount():0;
		}
		return discounted;
	}
	public void printReceipt() 
	{
		System.out.println(veges);
	}
}
