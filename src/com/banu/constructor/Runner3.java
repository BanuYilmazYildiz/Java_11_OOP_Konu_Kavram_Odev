package com.banu.constructor;

import com.banu.constructor.entity.Ogrenci;

public class Runner3 {
	public static void main(String[] args) {
		/**
		 * Soru 3: Copy constructor'ın ne olduğunu açıklayın ve bir sınıf içinde nasıl
		 * kullanılacağına dair bir örnek kod yazın.
		 * 
		 * Cevap 3 ->sınıfın mevcut bir nesnesinin değerlerini kullanarak yeni bir nesne
		 * oluşturmak için kullanılan bir constructor türüdür. Bu tür constructor,
		 * genellikle bir nesneyi kopyalama veya klonlama ihtiyacını karşılamak için
		 * kullanılır.
		 */

		Ogrenci ogrenci1 = new Ogrenci("Banu", 27);
		ogrenci1.bilgileriGoster();

		Ogrenci ogrenci2 = new Ogrenci(ogrenci1);
		ogrenci2.bilgileriGoster();
	}

}
