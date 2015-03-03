package com.bigcay.factory3;

public class ChicagoStyleClamPizza extends Pizza {

	@Override
	protected void prepare() {
		System.out.println("prepare Chicago style clam pizza");
	}

	@Override
	protected void bake() {
		System.out.println("bake Chicago style clam pizza");
	}

	@Override
	protected void cut() {
		System.out.println("cut Chicago style clam pizza");
	}

	@Override
	protected void box() {
		System.out.println("box Chicago style clam pizza");
	}

}
