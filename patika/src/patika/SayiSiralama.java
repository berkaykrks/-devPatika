package patika;

import java.util.Scanner;

public class SayiSiralama {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Üç sayıyı sırayla girin:");

        double sayi1 = scanner.nextDouble();
        double sayi2 = scanner.nextDouble();
        double sayi3 = scanner.nextDouble();

        // Sayıları sırala
        if (sayi1 <= sayi2 && sayi1 <= sayi3) {
            if (sayi2 <= sayi3) {
                System.out.println("Sıralama: " + sayi1 + " <= " + sayi2 + " <= " + sayi3);
            } else {
                System.out.println("Sıralama: " + sayi1 + " <= " + sayi3 + " <= " + sayi2);
            }
        } else if (sayi2 <= sayi1 && sayi2 <= sayi3) {
            if (sayi1 <= sayi3) {
                System.out.println("Sıralama: " + sayi2 + " <= " + sayi1 + " <= " + sayi3);
            } else {
                System.out.println("Sıralama: " + sayi2 + " <= " + sayi3 + " <= " + sayi1);
            }
        } else {
            if (sayi1 <= sayi2) {
                System.out.println("Sıralama: " + sayi3 + " <= " + sayi1 + " <= " + sayi2);
            } else {
                System.out.println("Sıralama: " + sayi3 + " <= " + sayi2 + " <= " + sayi1);
            }
        }

        scanner.close();

	}

}
