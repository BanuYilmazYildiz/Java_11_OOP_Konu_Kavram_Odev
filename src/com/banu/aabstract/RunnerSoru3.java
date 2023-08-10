package com.banu.aabstract;

import com.banu.aabstract.enitity.Insan;
import com.banu.aabstract.enitity.Kedi;

public class RunnerSoru3 {

	public static void main(String[] args) {
		/**
		 * Soru 3: Soyut sınıflar ile interfaceler arasındaki farkları açıklayın ve her
		 * iki durum için de örnekler verin.
		 * 
		 * 
		 * Cevap 3-> Soyut sınıflar, hem soyut hem de somut metotları içerebilir. Yani
		 * metotların hem bildirimleri hem de gövdeleri olabilir. Bir sınıf sadece bir
		 * tane soyut sınıftan türeyebilir. Yani bir sınıf yalnızca bir soyut sınıfın
		 * alt sınıfı olabilirken, birden fazla arayüzü uygulayabilir. Alt sınıflar,
		 * soyut sınıfın somut metotlarını kullanabilir veya bu metotları override
		 * edebilirler. Soyut sınıfların içindeki değişkenlerin değeri değişebilir ve
		 * somut bir durum taşıyabilirler.
		 */

		// Ornek olaran kod yazacaksak yine Canlı insan ve kedi sınıfları olsun
		/**
		 * Kedi ve Insan yasamak için nefes almak ve beslenmek zorundadır bu yüzden
		 * yasam içinde bu abstract metodlar tanılandı ve bir tane somut eglence isimli
		 * metod tanımladım, bunu kullanmak zorunlu değil o yüzden sadece insana
		 * override ettim
		 */
		Kedi kedi = new Kedi();
		Insan insan = new Insan();

		// kedi ve insan Yasam sınıfından miras alır ;
		kedi.beslen();
		kedi.nefesAl();
		insan.beslen();
		insan.nefesAl();
		// Yasam sınıfında somut method sadece insana verilmiştir
		insan.eglence();
		// İnsan ve kedinin ortak yapabildiği şeyleri IYapabilir interfacinden
		// implemente edilir
		insan.kos();
		kedi.kos();
		insan.sinirlen();
		kedi.sinirlen();
		// insan ek oalrak IYapabilir interfacinden de implement alır;
		insan.dusunme();

	}

}
