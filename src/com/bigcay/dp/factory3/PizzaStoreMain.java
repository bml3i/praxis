package com.bigcay.dp.factory3;

public class PizzaStoreMain {

	public static void main(String[] args) {
		PizzaStore pizzaStore = new NYPizzaStore();
		pizzaStore.orderPizza("clam");
		pizzaStore.orderPizza("cheese");
		
		PizzaStore pizzaStore2 = new ChicagoPizzaStore();
		pizzaStore2.orderPizza("clam");
		pizzaStore2.orderPizza("cheese");
	}
}
