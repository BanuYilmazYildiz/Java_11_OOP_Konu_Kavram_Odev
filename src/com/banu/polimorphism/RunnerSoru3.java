package com.banu.polimorphism;

import com.banu.polimorphism.entity.DoubleBolme;
import com.banu.polimorphism.entity.IIslem;
import com.banu.polimorphism.entity.IntBolme;
import com.banu.polimorphism.entity.Toplam;

public class RunnerSoru3 {

	public static void main(String[] args) {
		/**
		 * Soru 3: Dinamik ve statik çok biçimlilik arasındaki farkı açıklayın. Her
		 * ikisi için de örnekler verin.
		 * 
		 * Cevap 3 ->
		 * 
		 * Statik/ Erken bağlanma/ Derleme zamanı polimorfizmi
		 * 
		 * Statik, yani erken bağlanma, derleme zamanında meydana gelen olayları ifade
		 * eder. Özetle, bir işlevi çağırmak için gereken tüm bilgiler derleme zamanında
		 * biliniyorsa, erken bağlanma gerçekleşir. Statik biçimlilik overloading ile
		 * gerçekleşir.
		 * 
		 * Dinamik/ Geç bağlanma/ Çalışma zamanı polimorfizmi
		 * 
		 * Çalışma zamanında yani kodun çalıştığı sırada çözümlenen bir çok
		 * biçimliliktir. Kalıtım ve override ile gerçekleşir. Bu şekilde aynı method
		 * adı ve parametreleri olan acak farklı davranışlar sergileyen methodlardır.
		 */

		// Statik Çok Biçimlilik
		Toplam toplam = new Toplam();

		toplam.toplam(2, 3); // int değerinde toplam sonucu verir
		System.out.println(toplam.toplam(2, 3));

		toplam.toplam(2.2, 3.3); // double değerinde toplam sonucu verir
		System.out.println(toplam.toplam(2.2, 3.3));

		// Dinamik Çok Biçimlilik
		IIslem islem1;
		islem1 = new DoubleBolme();
		islem1.bolme(15, 2);

		IIslem islem2;
		islem2 = new IntBolme();
		islem2.bolme(15, 2);
	}

}
