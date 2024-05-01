package patika;

import java.util.Scanner;

public class MukemmelSayi {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int num = input.nextInt();

        int sumOfDivisors = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sumOfDivisors += i;
            }
        }

        if (sumOfDivisors == num) {
            System.out.println(num + " Mükemmel sayıdır.");
        } else {
            System.out.println(num + " Mükemmel sayı değildir.");
        }
    }
}
