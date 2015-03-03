package com.bigcay.dp.factory2;

public class CheesePizza extends Pizza {

	@Override
	protected void prepare() {
		System.out.println("prepare cheese pizza");
	}

	@Override
	protected void bake() {
		System.out.println("bake cheese pizza");
	}

	@Override
	protected void cut() {
		System.out.println("cut cheese pizza");
	}

	@Override
	protected void box() {
		System.out.println("box cheese pizza");
	}

}
