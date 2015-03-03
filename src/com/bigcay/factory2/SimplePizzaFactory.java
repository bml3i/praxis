package com.bigcay.factory2;

public class SimplePizzaFactory {

	public Pizza createPizza(String type) {
		Pizza pizza = null;

		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("clam")) {
			pizza = new ClamPizza();
		}

		return pizza;
	}
	
}
