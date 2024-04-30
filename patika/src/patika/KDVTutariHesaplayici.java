package patika;

import java.util.Scanner;

public class KDVTutariHesaplayici {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("KDV'li fiyatını hesaplamak istediğiniz tutarı girin:");
        double tutar = scanner.nextDouble();

        double kdvOrani = (tutar > 1000) ? 0.08 : 0.18;
        double kdvTutari = tutar * kdvOrani;
        double kdvliFiyat = tutar + kdvTutari;

        System.out.println("KDV'siz Fiyat: " + tutar);
        System.out.println("KDV Oranı: %" + (kdvOrani * 100));
        System.out.println("KDV Tutarı: " + kdvTutari);
        System.out.println("KDV'li Fiyat: " + kdvliFiyat);

        scanner.close();

	}

}
