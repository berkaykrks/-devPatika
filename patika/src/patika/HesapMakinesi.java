package patika;

import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("İlk sayıyı girin:");
        double sayi1 = scanner.nextDouble();

        System.out.println("İkinci sayıyı girin:");
        double sayi2 = scanner.nextDouble();

        System.out.println("Yapmak istediğiniz işlemi seçin:");
        System.out.println("1. Toplama");
        System.out.println("2. Çıkarma");
        System.out.println("3. Çarpma");
        System.out.println("4. Bölme");

        int secim = scanner.nextInt();

        double sonuc = 0;

        switch (secim) {
            case 1:
                sonuc = sayi1 + sayi2;
                break;
            case 2:
                sonuc = sayi1 - sayi2;
                break;
            case 3:
                sonuc = sayi1 * sayi2;
                break;
            case 4:
                if (sayi2 != 0) {
                    sonuc = sayi1 / sayi2;
                } else {
                    System.out.println("Bir sayıyı 0'a bölemezsiniz!");
                    scanner.close(); // Hata durumunda da scanner'ı kapat
                    return;
                }
                break;
            default:
                System.out.println("Geçersiz seçim!");
                scanner.close(); // Hata durumunda da scanner'ı kapat
                return;
        }

        System.out.println("Sonuç: " + sonuc);

        scanner.close(); 

	}

}
