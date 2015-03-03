package com.bigcay.dp.factory3;

public class NYStyleClamPizza extends Pizza {

	@Override
	protected void prepare() {
		System.out.println("prepare NY style clam pizza");
	}

	@Override
	protected void bake() {
		System.out.println("bake NY style clam pizza");
	}

	@Override
	protected void cut() {
		System.out.println("cut NY style clam pizza");
	}

	@Override
	protected void box() {
		System.out.println("box NY style clam pizza");
	}

}
