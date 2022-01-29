package com.learn;

public class DemoT {
	public static void main(String[] args)
	{
		VegetableBill veges=new VegetableBill(new Employee(), true);
		veges.add(new Item(1.24,0.20));
		veges.add(new Item(1.58,0.30));
		veges.add(new Item(2.13,0.0));
		System.out.println(veges.getTotal());
		System.out.println(veges.getDiscounted());
		DiscountBill discount=new DiscountBill(new Employee(),true);
		discount.add(new Item(1.22,0.3));
		discount.add(new Item(1.89,0.23));
		discount.add(new Item(2.65,0.0));
		System.out.println(discount.getDiscountCount());
		System.out.println(discount.getDiscountAmount());
		System.out.println(discount.getDiscountPercent());
	}
}
