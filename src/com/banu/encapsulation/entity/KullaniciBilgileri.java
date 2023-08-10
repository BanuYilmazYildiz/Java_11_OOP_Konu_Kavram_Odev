package com.banu.encapsulation.entity;

public class KullaniciBilgileri {

	String kullaniciAdi;
	String sifre = "123ab";
	private String anneKizlikSoyadi;
	public String cisiyet;
	protected String dogumYeri;

	public String getKullaniciAdi() {
		return kullaniciAdi;
	}

	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}

	public void setSifre(String sifre) {
		if (this.sifre == sifre) {
			System.out.println("Kullanıcı giriş yapabilir");
		} else
			System.out.println("Şifre yanlış kullanıcı giremez");
	}

	public String getAnneKizlikSoyadi() { // anne kızlık soyadına sadece bu sınıfran erişim sağlanır.
		return anneKizlikSoyadi;
	}

	public void setAnneKizlikSoyadi(String anneKizlikSoyadi) { // anne kızlık soyadına sadece bu sınıfran erişim
																// sağlanır.
		this.anneKizlikSoyadi = anneKizlikSoyadi;
	}

	public String getCisiyet() {
		return cisiyet;
	}

	public void setCisiyet(String cisiyet) {
		this.cisiyet = cisiyet;
	}

	public String getDogumYeri() {
		return dogumYeri;
	}

	public void setDogumYeri(String dogumYeri) {
		this.dogumYeri = dogumYeri;
	}

	public String getSifre() {
		return sifre;
	}

}
