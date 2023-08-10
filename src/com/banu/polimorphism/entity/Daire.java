package com.banu.polimorphism.entity;

public class Daire extends Sekil {

	private double yaricap;
	private double piSayisi;

	public Daire(double yaricap, double piSayisi) {
		super();
		this.yaricap = yaricap;
		this.piSayisi = piSayisi;
	}

	@Override
	public double alanHesapla() {
		System.out.println("Dairenin Alanı;");
		return piSayisi * yaricap * yaricap;
	}

}
