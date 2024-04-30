package patika;

import java.util.Scanner;

public class IsArmstrong {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int sayi = scanner.nextInt();

        int tempSayi = sayi;
        int basamaklarToplami = 0;

        while (tempSayi != 0) {
            // Sayının son basamağını alıp toplama ekleyin
            int basamak = tempSayi % 10;
            basamaklarToplami += basamak;

            // Son basamağı aldıktan sonra sayıdan çıkartın
            tempSayi /= 10;
        }

        System.out.println("Sayının basamaklarının toplamı: " + basamaklarToplami);
        scanner.close();
    }
}
