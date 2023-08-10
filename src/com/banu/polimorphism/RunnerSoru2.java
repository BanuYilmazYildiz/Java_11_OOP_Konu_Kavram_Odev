package com.banu.polimorphism;

import com.banu.polimorphism.entity.IBitki;
import com.banu.polimorphism.entity.Kaktus;
import com.banu.polimorphism.entity.Starlice;

public class RunnerSoru2 {

	public static void main(String[] args) {
		/**
		 * Soru 2: Bir interface'in, çok biçimlilikle nasıl kullanılabileceğini
		 * açıklayın ve bir örnek verin.
		 * 
		 * Cevap 2 -> interface zaten bir methodu override ile kullanmamıza yarıyor.
		 * Hali hazırda override edilmiş metohdları aynı isimleri ile kullabiliriz.
		 */

		IBitki bitki;

		bitki = new Kaktus();
		bitki.sulama();

		System.out.println("**********");

		bitki = new Starlice();
		bitki.sulama();
	}

}
