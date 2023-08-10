package com.banu.encapsulation;

import com.banu.encapsulation.entity.KullaniciBilgileri;

public class RunnerSoru1 {

	public static void main(String[] args) {
		/**
		 * Soru 1: Kapsüllemenin (encapsulation) neden önemli olduğunu açıklayın ve
		 * Java'da nasıl uygulanabileceğine dair bir örnek verin.
		 * 
		 * Cevap 1 -> Kapsülleme yazdığımız kodun korunması için önemlidir. Sınıfın
		 * içinde tanımladığımız varlıkların her zaman erişilebilir olmasını istemeyiz.
		 * Varlığın istediğimiz zaman erişilebilir olması içinde, çağırabileceğimiz,
		 * görüntüleyip düzenleyebileceğimiz methodlar yazarız. Bu methodlara getter
		 * setter deriz.
		 * 
		 * Mesela kullanıcı bilgilerinde şifre girilen bir değer olabilir ama
		 * görüntülenen bir değer olamaz. Ya da kısıtlmalar koyabliriz, eğer girilen
		 * sifre doğru ise çalışır yanlış ise çalışmaz.
		 */
		KullaniciBilgileri kullanici = new KullaniciBilgileri();
		kullanici.setSifre("123ab");

	}

}
