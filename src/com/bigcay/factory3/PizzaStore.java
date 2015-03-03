package com.bigcay.factory3;

public abstract class PizzaStore {

	protected abstract Pizza createPizza(String type);
	
	public void orderPizza(String type) {
		Pizza pizza = createPizza(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
	}
}
