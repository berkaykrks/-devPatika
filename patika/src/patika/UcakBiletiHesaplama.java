package patika;

import java.util.Scanner;

public class UcakBiletiHesaplama {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan mesafeyi, yaşını ve yolculuk tipini al
        System.out.print("Mesafeyi km türünden giriniz: ");
        int mesafe = scanner.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        int yas = scanner.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        int yolculukTipi = scanner.nextInt();

        // Hatalı veri kontrolü
        if (mesafe <= 0 || yas <= 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            System.out.println("Hatalı Veri Girdiniz !");
            return;
        }

        // Normal ücret hesaplama
        double normalUcret = mesafe * 0.10;

        // Yaş indirimi hesaplama
        double indirimOrani = 0;
        if (yas < 12) {
            indirimOrani = 0.50;
        } else if (yas >= 12 && yas <= 24) {
            indirimOrani = 0.10;
        } else if (yas >= 65) {
            indirimOrani = 0.30;
        }

        double yasIndirimi = normalUcret * indirimOrani;

        // Yolculuk tipine göre indirim hesaplama
        double toplamTutar = normalUcret - yasIndirimi;
        if (yolculukTipi == 2) {
            toplamTutar *= 0.80; // %20 indirim
        }

        // Sonuçları ekrana yazdırma
        System.out.println("Toplam Tutar = " + toplamTutar + " TL");

        scanner.close();

	}

}
