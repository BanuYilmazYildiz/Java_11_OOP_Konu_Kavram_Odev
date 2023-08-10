package com.banu.polimorphism.entity;

public class Dikdortgen extends Sekil {

	private double tabanUzunlugu;
	private double yukseklik;

	public Dikdortgen(double tabanUzunlugu, double yukseklik) {
		super();
		this.tabanUzunlugu = tabanUzunlugu;
		this.yukseklik = yukseklik;
	}

	@Override
	public double alanHesapla() {
		System.out.println("Dikdörtgenin Alanı;");
		return tabanUzunlugu * yukseklik;
	}

}
