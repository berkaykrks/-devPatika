package patika;

import java.util.Scanner;

public class TaksimetreProgrami {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Gidilen mesafeyi (KM) girin:");
	        double mesafe = scanner.nextDouble();

	        // Taksimetre açılış ücreti
	        double acilisUcreti = 10.0;

	        // KM başına ücret
	        double kmBasinaUcret = 2.20;

	        // Taksimetre tutarını hesapla
	        double taksimetreTutari = acilisUcreti + (mesafe * kmBasinaUcret);

	        // Minimum ücret kontrolü
	        if (taksimetreTutari < 20.0) {
	            taksimetreTutari = 20.0;
	        }

	        System.out.println("Taksimetre Tutarı: " + taksimetreTutari + " TL");

	        scanner.close();

	}

}
