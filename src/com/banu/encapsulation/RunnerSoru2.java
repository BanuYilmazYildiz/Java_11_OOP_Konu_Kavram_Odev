package com.banu.encapsulation;

import com.banu.encapsulation.entity.KullaniciBilgileri;

public class RunnerSoru2 {
	public static void main(String[] args) {

		/**
		 * Soru 2: Java'da "private", "public", ve "protected" anahtar kelimelerinin ne
		 * anlama geldiğini açıklayın ve kullanımları hakkında örnekler sunun.
		 * 
		 * Cevap 2 ->
		 * 
		 * private -> private sadece sınıfa özel kullanılabilecek erişim belirtecidir.
		 * paket içinden başka sınıf ve paket dışından erişim olmaz.
		 * 
		 * public -> Her yerden erişime açık erişim belirtecidir. sınıf dışından ve
		 * paket dışından da erişilebilir.
		 * 
		 * protected -> Paket içindeki sınıflar içinde erişim sağlanabilir paket dışında
		 * erişim kapalıdır.
		 * 
		 * 
		 */

		// Kullanıcı bilgileri sınıfında anneKizlikSoyadi private belirtece sahiptir bu
		// nedenle ona sadece Kullanıcı bilgileri sınıfında ulaşabiliriz
		KullaniciBilgileri kullanici = new KullaniciBilgileri();
		// kullanici.anneKizlikSoyadi = "Yısdas"; --> Çalışmaz

		// KullanıcıBilgileri sınıdında kullanıcının cinsiyeti publictir. Paket dışından
		// da ulaşılabilir.
		kullanici.cisiyet = "Kadın";
		System.out.println("Cisiyet -> " + kullanici.cisiyet);

		// KullanıcıBilgileri sınıdında doğum yeri protected belirteçtir. Paket dışından
		// ulaşılamayacak. Sınıf içinde ve aynı paket sınıflarda ulaşılacak. Deneme adlı
		// sınıftan bakılabilir.
		// kullanici.dogumYeri = "Kocaeli"; -> çalışmaz
	}

}
