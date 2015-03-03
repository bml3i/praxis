package com.bigcay.factory2;

public class PizzaStore {

	SimplePizzaFactory factory;

	public PizzaStore(SimplePizzaFactory factory) {
		this.factory = factory;
	}

	public void orderPizza(String type) {
		Pizza pizza = this.factory.createPizza(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
	}

	public static void main(String[] args) {
		SimplePizzaFactory factory = new SimplePizzaFactory();

		PizzaStore pizzaStore = new PizzaStore(factory);

		pizzaStore.orderPizza("clam");
		pizzaStore.orderPizza("cheese");
	}

}
