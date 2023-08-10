package com.banu.aabstract.enitity;

public abstract class Telefon {

	String marka;
	String model;

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public abstract double telefonAl(double fiyat, double kdv);

}
