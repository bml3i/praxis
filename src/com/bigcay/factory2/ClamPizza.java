package com.bigcay.factory2;

public class ClamPizza extends Pizza {

	@Override
	protected void prepare() {
		System.out.println("prepare clam pizza");
	}

	@Override
	protected void bake() {
		System.out.println("bake clam pizza");
	}

	@Override
	protected void cut() {
		System.out.println("cut clam pizza");
	}

	@Override
	protected void box() {
		System.out.println("box clam pizza");
	}

}
