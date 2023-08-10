package com.banu.constructor.entity;

public class Araba extends Arac {

	public Araba(String marka, String model) {
		this.marka = marka;
		this.model = model;
	}

	public Araba(String marka, int uretimYili, String renk) {
		this.marka = marka;
		this.uretimYili = uretimYili;
		this.renk = renk;
	}

}
