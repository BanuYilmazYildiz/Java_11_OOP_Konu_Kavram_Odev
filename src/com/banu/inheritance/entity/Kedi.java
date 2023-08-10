package com.banu.inheritance.entity;

public class Kedi implements Memeli, Evcil {

	@Override
	public void dogumYapma() {
		System.out.println("Kedi doğum yaptı.");

	}

	@Override
	public void emzir() {
		System.out.println("Kedi emzirdi.");

	}

	@Override
	public void oyunOynama() {
		System.out.println("Kedi yumakla oynadı.");
	}

	@Override
	public void sevdirme() {
		System.out.println("Kedi kendini sevdirdi.");

	}

}
