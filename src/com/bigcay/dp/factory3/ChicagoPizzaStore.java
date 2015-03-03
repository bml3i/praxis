package com.bigcay.dp.factory3;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = null;

		if (type.equals("cheese")) {
			pizza = new ChicagoStyleCheesePizza();
		} else if (type.equals("clam")) {
			pizza = new ChicagoStyleClamPizza();
		}

		return pizza;
	}

}
