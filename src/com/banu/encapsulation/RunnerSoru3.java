package com.banu.encapsulation;

import com.banu.encapsulation.entity.KullaniciBilgileri;

public class RunnerSoru3 {

	public static void main(String[] args) {

		/**
		 * Soru 3: Bir sınıfta getter ve setter metodlarının ne amaçla kullanıldığını ve
		 * bunların nasıl tanımlanacağını bir örnek ile açıklayın.
		 * 
		 * Cevap 3 -> Aslında soru 1 ile hemen hemen aynı cevaba sahip. Sadece sınıf
		 * içiresinden ulaşılabilen, diğer bir deyişle encapsullation yapılmış bilgilere
		 * başka sınıflardan ya da paket dışından ulabilmek için kullandığımız
		 * metthodlardır.
		 * 
		 */
		KullaniciBilgileri kullanici = new KullaniciBilgileri();

		// setter -> method içine parametre vererek sınıfa özel olan field değerini
		// değiştirebiliyoruz.
		kullanici.setAnneKizlikSoyadi("Yaldız");

		// getter -> İçerideki field değerini bize geri dönüyor.
		System.out.println(kullanici.getAnneKizlikSoyadi());

	}

}
