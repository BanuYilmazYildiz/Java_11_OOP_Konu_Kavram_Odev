package com.banu.polimorphism.entity;

public class IntBolme implements IIslem {

	@Override
	public void bolme(int a, int b) {
		System.out.println("Tam bölüm = " + (a / b));
	}

}
