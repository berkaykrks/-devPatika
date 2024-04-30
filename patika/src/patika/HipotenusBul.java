package patika;

import java.util.Scanner;

public class HipotenusBul {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Dik üçgenin birinci dik kenarının uzunluğunu girin:");
        double a = scanner.nextDouble();

        System.out.println("Dik üçgenin ikinci dik kenarının uzunluğunu girin:");
        double b = scanner.nextDouble();

        // Hipotenüsü hesapla
        double hipotenus = Math.sqrt((a * a) + (b * b));

        System.out.println("Dik üçgenin hipotenüsü: " + hipotenus);

        // Alan hesaplaması için üçgenin diğer kenarını bulma
        double c = Math.sqrt((hipotenus * hipotenus) - (a * a));

        // Üçgenin çevresini hesapla
        double u = (a + b + c) / 2;

        // Üçgenin alanını hesapla
        double alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Üçgenin alanı: " + alan);

        scanner.close();

	}

}
