package com.bigcay.dp.factory3;

public class ChicagoStyleCheesePizza extends Pizza {

	@Override
	protected void prepare() {
		System.out.println("prepare Chicago style cheese pizza");
	}

	@Override
	protected void bake() {
		System.out.println("bake Chicago style cheese pizza");
	}

	@Override
	protected void cut() {
		System.out.println("cut Chicago style cheese pizza");
	}

	@Override
	protected void box() {
		System.out.println("box Chicago style cheese pizza");
	}

}
