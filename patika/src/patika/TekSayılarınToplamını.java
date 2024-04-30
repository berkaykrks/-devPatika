package patika;

import java.util.Scanner;

public class TekSayılarınToplamını {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        int toplam = 0;
        boolean devam = true;

        System.out.println("Negatif bir değer girene kadar girişleri kabul edeceğiz.");

        while (devam) {
            System.out.print("Bir sayı giriniz: ");
            int sayi = scanner.nextInt();

            if (sayi < 0) {
                devam = false; // Negatif sayı girildiği zaman döngüyü sonlandır
            } else {
                if (sayi % 2 == 0 && sayi % 4 == 0) {
                    toplam += sayi;
                }
            }
        }

        System.out.println("Girilen çift ve 4'ün katları olan sayıların toplamı: " + toplam);

        scanner.close();

	}

}
