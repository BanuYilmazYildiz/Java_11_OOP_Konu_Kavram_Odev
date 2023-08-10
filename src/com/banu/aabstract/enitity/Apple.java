package com.banu.aabstract.enitity;

public class Apple extends Telefon {

	@Override
	public double telefonAl(double fiyat, double kdv) {
		System.out.println(this.model + " fiyatı;");
		return fiyat * kdv + fiyat;

	}

//	public abstract void telefonVer() {
//		System.out.println(" ");
//	}

}
