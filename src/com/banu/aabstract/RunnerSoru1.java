package com.banu.aabstract;

import com.banu.aabstract.enitity.Apple;

public class RunnerSoru1 {

	public static void main(String[] args) {
		/**
		 * Soru 1: Soyut sınıfların (abstract classes) ve soyut metodların (abstract
		 * methods) ne olduğunu açıklayın. Bir soyut sınıf tanımlayın ve bu sınıftan
		 * türetilen bir alt sınıf oluşturun.
		 * 
		 * Cevap 1 -> Soyut sınıflar, nesne oluşturulamayan sınıflardır. Bu sınıflar,
		 * diğer alt sınıfların temelini oluşturur ve genellikle ortak özellikleri ve
		 * metotları içerir. Soyut sınıflar, alt sınıflarına bazı davranışları uygulama
		 * zorunluluğu getirmek amacıyla kullanılır.
		 * 
		 * Soyut Metotlar sadece bildirimi yapılan, ancak gövdesi soyut sınıfta değil
		 * alt sınıflarda doldurulan metotlardır. Soyut metotlar, soyut sınıfların
		 * anahtar özelliğini oluşturur; çünkü bu metotlar, alt sınıflar tarafından
		 * zorunlu olarak uygulanmalıdır. Böylece, alt sınıflar aynı metodu farklı
		 * şekillerde uygulayarak çok biçimlilik (polimorfizm) sağlayabilir.
		 */

		Apple apple = new Apple();
		apple.setModel("14 Pro");
		System.out.println(apple.telefonAl(30_000, 0.18));

	}

}
