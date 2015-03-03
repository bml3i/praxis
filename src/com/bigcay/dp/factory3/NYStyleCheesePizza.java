package com.bigcay.dp.factory3;

public class NYStyleCheesePizza extends Pizza {

	@Override
	protected void prepare() {
		System.out.println("prepare NY style cheese pizza");
	}

	@Override
	protected void bake() {
		System.out.println("bake NY style cheese pizza");
	}

	@Override
	protected void cut() {
		System.out.println("cut NY style cheese pizza");
	}

	@Override
	protected void box() {
		System.out.println("box NY style cheese pizza");
	}

}
