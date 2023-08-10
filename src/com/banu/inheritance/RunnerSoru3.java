package com.banu.inheritance;

import com.banu.inheritance.entity.Cocuk;

public class RunnerSoru3 {

	public static void main(String[] args) {
		/**
		 * Soru 3: "super" anahtar kelimesinin ne işe yaradığını açıklayın ve bir üst
		 * sınıfın constructor'ını çağırmak için nasıl kullanılacağına dair bir örnek
		 * verin.
		 * 
		 * Cevap 3 -> super anahtar kelimesi miras alınan sınıfın costructorunu ifade
		 * etmektedir.
		 * 
		 * Anne sınıfı oluşturdum ve defoult contructoru çaşıştığında ekrana yazdırdım.
		 * Çocuk sınıfı oluşturdum anneden miras alıyor, anne sınıfının ocnstructorunu
		 * çğırmak için kendi parametresiz constructoruna super(); ile miras aldğıı
		 * sınıfın construtorunu çağırmış oldum.
		 */

		Cocuk cocuk = new Cocuk();

	}

}
