package patika;

import java.util.Scanner;

public class UsluSayiHesaplayan {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Taban sayıyı giriniz: ");
        int taban = scanner.nextInt();

        System.out.print("Üs sayıyı giriniz: ");
        int us = scanner.nextInt();

        // Üslü sayıyı hesaplamak için bir değişken oluşturun ve başlangıç değerini taban olarak ayarlayın
        int usluSayi = taban;

        // Üslü sayıyı hesaplamak için for döngüsü kullanın
        for (int i = 1; i < us; i++) {
            usluSayi *= taban;
        }

        // Sonucu ekrana yazdırın
        System.out.println("Sonuç: " + usluSayi);

        scanner.close();
	}

}
