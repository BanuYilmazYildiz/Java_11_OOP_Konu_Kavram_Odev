package com.banu.constructor.entity;

public class Ogrenci {

	private String ad;
	private int yas;

	public Ogrenci(String ad, int yas) {
		super();
		this.ad = ad;
		this.yas = yas;
	}

	public Ogrenci(Ogrenci ogr) {
		this.ad = ogr.ad;
		this.yas = ogr.yas;

	}

	public void bilgileriGoster() {
		System.out.println("Ad = " + ad + "\nYaş = " + yas);
	}

}
