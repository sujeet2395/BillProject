package com.learn;

public class DiscountBill extends VegetableBill{

	public DiscountBill(Employee clerk, boolean preferred) {
		super(clerk, preferred);
	}
	public int getDiscountCount()
	{
		int count=0;
		for(Item item:veges)
		{
			count+=item.getDiscount()>0 && isPreferred()?1:0;
		}
		return count;
	}
	public double getDiscountAmount() {
		return getDiscounted();
	}
	public double getDiscountPercent()
	{
		return getDiscountAmount()*0.01/getTotal();
	}
}
