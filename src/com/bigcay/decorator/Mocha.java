package com.bigcay.decorator;

public class Mocha extends CondimentDecorator {

	private Beverage beverage; 
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage; 
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Moca";
	}

	@Override
	public double cost() {
		return 0.20 + beverage.cost();
	}
}