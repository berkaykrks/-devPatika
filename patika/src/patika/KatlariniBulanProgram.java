package patika;

import java.util.Scanner;

public class KatlariniBulanProgram {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        System.out.println("4 ve 5'in kuvvetleri:");

        for (int i = 1; i <= sayi; i++) {
            int kuvvet4 = (int) Math.pow(4, i);
            int kuvvet5 = (int) Math.pow(5, i);
            System.out.println("4^" + i + " = " + kuvvet4);
            System.out.println("5^" + i + " = " + kuvvet5);
        }

        scanner.close();
    }
}
