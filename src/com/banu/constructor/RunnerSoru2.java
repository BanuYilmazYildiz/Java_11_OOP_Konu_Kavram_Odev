package com.banu.constructor;

import com.banu.constructor.entity.Araba;

public class RunnerSoru2 {

	public static void main(String[] args) {
		/**
		 * Soru 2: Aşırı yüklenmiş constructor'larla (overloaded constructors) ilgili
		 * bir örnek verin. Farklı parametre tiplerine sahip en az iki constructor
		 * içermelidir.
		 */

		Araba araba = new Araba("BMW", "5.20");
		System.out.println(araba.marka + " markasının " + araba.model + " modeli satın alındı.");

		Araba araba2 = new Araba("Mercedes", 2023, "kırmızı");
		System.out.println(araba2.marka + " markasının " + araba2.uretimYili + " üretim yılına ait " + araba2.renk
				+ " rengini çok beğeniyorum.");
	}

}
