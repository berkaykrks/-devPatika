package patika;

import java.util.Scanner;

public class CinZodyagiHesaplama {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Doğum Yılınızı Giriniz: ");
	        int dogumYili = scanner.nextInt();

	        // Çin Zodyağı hesaplama
	        String[] zodyaklar = {"Maymun", "Horoz", "Köpek", "Domuz", "Fare", "Öküz", 
	                              "Kaplan", "Tavşan", "Ejderha", "Yılan", "At", "Koyun"};

	        int indeks = dogumYili % 12;
	        String zodyak = zodyaklar[indeks];

	        // Sonucu ekrana yazdırma
	        System.out.println("Çin Zodyağı Burcunuz: " + zodyak);

	        scanner.close();

	}

}
