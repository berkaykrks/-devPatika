package patika;

import java.util.Scanner;

public class DaireHesaplayici {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Dairenin yarı çapını girin:");
        double yariCap = scanner.nextDouble();

        // Dairenin alanını hesapla
        double alan = Math.PI * yariCap * yariCap;
        System.out.println("Dairenin Alanı: " + alan);

        // Dairenin çevresini hesapla
        double cevre = 2 * Math.PI * yariCap;
        System.out.println("Dairenin Çevresi: " + cevre);

        System.out.println("Daire diliminin merkez açısının ölçüsünü girin (derece cinsinden):");
        double aci = scanner.nextDouble();

        // Daire diliminin alanını hesapla
        double dilimAlan = (Math.PI * (yariCap * yariCap) * aci) / 360;
        System.out.println("Daire Diliminin Alanı: " + dilimAlan);

        scanner.close();
	}

}
