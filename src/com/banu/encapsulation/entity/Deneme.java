package com.banu.encapsulation.entity;

public class Deneme {
	public static void main(String[] args) {

		KullaniciBilgileri kullanici = new KullaniciBilgileri();
		kullanici.dogumYeri = "Kocaeli"; // protected belirteç aynı paket farklı sınıftan erişilebilşiyor.
		System.out.println("Doğum yeri -> " + kullanici.dogumYeri);

	}
}
