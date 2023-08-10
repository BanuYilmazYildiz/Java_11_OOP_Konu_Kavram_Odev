package com.banu.inheritance;

import com.banu.inheritance.entity.Dikdortgen;
import com.banu.inheritance.entity.Ucgen;

public class RunnerSoru1 {

	public static void main(String[] args) {
		/**
		 * Soru 1: Java'da bir sınıfın başka bir sınıftan kalıtım almasını sağlayan
		 * anahtar kelimenin ne olduğunu açıklayın ve iki sınıf arasında nasıl
		 * kullanılacağına dair bir örnek kod yazın.
		 * 
		 * Cevap 1 -> anhtar kelime extends. Herhangi bir sınıf özelliklerini (fields,
		 * methodlar vs) miras olarak almayı sağlar.
		 */

		Dikdortgen dikdortgen = new Dikdortgen();
		dikdortgen.sekilAdi = "Dikdörtgen";
		dikdortgen.kenarSayisi = 4;
		dikdortgen.koseSayisi = 4;
		dikdortgen.yukseklik = 5;
		System.out.println(dikdortgen.sekilAdi + " kenar sayısı -> " + dikdortgen.kenarSayisi);

		Ucgen ucgen = new Ucgen();
		ucgen.sekilAdi = "Üçgen";
		ucgen.kenarSayisi = 3;
		ucgen.koseSayisi = 3;
		ucgen.yukseklik = 9;
		System.out.println(ucgen.sekilAdi + " kenar sayısı -> " + ucgen.kenarSayisi);

	}

}
