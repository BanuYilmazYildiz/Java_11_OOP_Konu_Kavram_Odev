package com.banu.aabstract.enitity;

public class Insan extends Yasam implements IYapabilir, IYapabilir2 {

	@Override
	public void nefesAl() {
		System.out.println("İnsanlar nefes alır");

	}

	@Override
	public void beslen() {
		System.out.println("İnsanlar beslenir");

	}

	@Override
	public void eglence() {
		System.out.println("İnsanlar arkadaşlarıyla eğlenir.");
	}

	@Override
	public void kos() {
		System.out.println("İnsan koşar");

	}

	@Override
	public void yuru() {
		System.out.println("İnsan yürür");

	}

	@Override
	public void sinirlen() {
		System.out.println("İnsan sinirlenir");

	}

	@Override
	public void dusunme() {
		System.out.println("İnsan düşünür");

	}

	@Override
	public void konusma() {
		System.out.println("İnsan konuşur");

	}

}
