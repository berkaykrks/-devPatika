package patika;

import java.util.Scanner;

public class CiftSayiBulma {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Kullanıcıdan bir sayı al
	        System.out.print("Bir sayı giriniz: ");
	        int sayi = scanner.nextInt();

	        // Çift olan sayıları bulma
	        System.out.println("0'dan " + sayi + "'e kadar olan çift sayılar:");
	        for (int i = 0; i <= sayi; i++) {
	            if (i % 2 == 0) {
	                System.out.print(i + " ");
	            }
	        }
	        System.out.println();

	        // 3 ve 4'e tam bölünen sayıların ortalamasını bulma
	        int toplam = 0;
	        int adet = 0;
	        for (int i = 0; i <= sayi; i++) {
	            if (i % 3 == 0 && i % 4 == 0) {
	                toplam += i;
	                adet++;
	            }
	        }
	        double ortalama = (double) toplam / adet;
	        System.out.println("0'dan " + sayi + "'e kadar olan 3 ve 4'e tam bölünen sayıların ortalaması: " + ortalama);

	        scanner.close();

	}

}
