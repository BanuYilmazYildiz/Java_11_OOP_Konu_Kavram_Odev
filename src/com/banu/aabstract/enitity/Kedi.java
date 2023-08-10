package com.banu.aabstract.enitity;

public class Kedi extends Yasam implements IYapabilir {

	@Override
	public void nefesAl() {
		System.out.println("Kediler nefes alır");

	}

	@Override
	public void beslen() {
		System.out.println("Kediler beslenir");

	}

	@Override
	public void kos() {
		System.out.println("Kedi koşar");

	}

	@Override
	public void yuru() {
		System.out.println("Kedi yürür");

	}

	@Override
	public void sinirlen() {
		System.out.println("Kedi sinirlenir");

	}

}
