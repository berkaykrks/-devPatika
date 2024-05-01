package patika;

import java.util.Scanner;

public class RecursiveIsPrime {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        int number = input.nextInt();

        if (isPrime(number, number / 2)) {
            System.out.println(number + " sayısı ASALDIR!");
        } else {
            System.out.println(number + " sayısı ASAL değildir!");
        }
    }

    static boolean isPrime(int number, int divisor) {
        if (divisor == 1) {
            return true;
        }
        if (number % divisor == 0) {
            return false;
        }
        return isPrime(number, divisor - 1);
    }
}
