package com.banu.inheritance;

import com.banu.inheritance.entity.Kedi;

public class RunnerSoru2 {
	public static void main(String[] args) {

		/**
		 * Soru 2: Çoklu kalıtımın Java'da neden desteklenmediğini açıklayın. Interface
		 * kullanarak çoklu kalıtımın nasıl simüle edilebileceğini bir örnek ile
		 * gösterin.
		 * 
		 * Cevap 2 -> Çoklu kaltım, bir sınıfın birden fazla snıftan miras almasıdır.
		 * Java dilinde direkt olarak bir sınıf diğer sınıflardan miras alamaz, ancak
		 * interface yardımı ile çoklu kalıtım yapılabilr. Çoklu kalıtım desteklenmez
		 * çünkü miras alınan iki sınıfta da (interfaced) aynı isimli method var ise
		 * hangisinin override edileceği bilinmez buna ise Diamond problem denir.
		 * 
		 * Çoklu kalıtımı kedi sınıfını hem memeli hem de evcil olarak tanımlayabimek
		 * için 2 interface oluşturdum ve ikisinden miras almış oldum.
		 */

		Kedi kedi = new Kedi();
		kedi.dogumYapma();
		kedi.emzir();
		kedi.oyunOynama();
		kedi.sevdirme();

	}
}
