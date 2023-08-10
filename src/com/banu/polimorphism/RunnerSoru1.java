package com.banu.polimorphism;

import com.banu.polimorphism.entity.Daire;
import com.banu.polimorphism.entity.Dikdortgen;
import com.banu.polimorphism.entity.Sekil;

public class RunnerSoru1 {

	public static void main(String[] args) {
		/**
		 * Soru 1: Java'da çok biçimliliğin (polimorphism) ne olduğunu açıklayın ve bir
		 * örnek ile bu kavramın nasıl kullanılacağını gösterin.
		 * 
		 * Cevao 1 -> tek bir method adı ile birden fazla methodu çalıştırma özelliği
		 * diyebiliriz.
		 */

		Sekil sekil = new Sekil();
		sekil = new Daire(5, 3.14);
		System.out.println(sekil.alanHesapla());

		System.out.println("******************");

		sekil = new Dikdortgen(5, 4);
		System.out.println(sekil.alanHesapla());

	}

}
