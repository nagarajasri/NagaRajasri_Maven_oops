package com.epam.mavendemo;

public class Sweets implements NewYearGift{
	public int weight;
	public int price;
	public Sweets(int sweetWeight, int sweetPrice) {
		super();
		this.weight = sweetWeight;
		this.price = sweetPrice;
	}
	public int getWeight() {
		return weight;
	}
	public int getSweetPrice() {
		return price;
	}
	public void setSweetWeight(int sweetWeight) {
		this.weight = sweetWeight;
	}
	public void setSweetPrice(int sweetPrice) {
		this.price = sweetPrice;
	}
	

}
