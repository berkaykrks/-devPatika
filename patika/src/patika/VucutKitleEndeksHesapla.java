package patika;

import java.util.Scanner;

public class VucutKitleEndeksHesapla {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz:");
	        double boy = scanner.nextDouble();

	        System.out.println("Lütfen kilonuzu giriniz:");
	        double kilo = scanner.nextDouble();

	        // Vücut Kitle İndeksi (VKİ) hesaplama
	        double vki = kilo / (boy * boy);

	        System.out.println("Vücut Kitle İndeksiniz: " + vki);

	        scanner.close();

	}

}
