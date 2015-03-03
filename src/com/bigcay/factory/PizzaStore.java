package com.bigcay.factory;

public class PizzaStore {

	public Pizza createPizza(String type) {
		Pizza pizza = null;

		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("clam")) {
			pizza = new ClamPizza();
		}

		return pizza;
	}

	public void orderPizza(String type) {
		Pizza pizza = createPizza(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
	}

	public static void main(String[] args) {

		PizzaStore pizzaStore = new PizzaStore();
		pizzaStore.orderPizza("clam");
		pizzaStore.orderPizza("cheese");
	}

}
