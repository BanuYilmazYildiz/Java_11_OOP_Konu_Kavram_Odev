package com.banu.polimorphism.entity;

public class DoubleBolme implements IIslem {

	@Override
	public void bolme(int a, int b) {
		double bolme = (double) a / b;
		System.out.println("Küsüratlı bölüm = " + bolme);

	}

}
