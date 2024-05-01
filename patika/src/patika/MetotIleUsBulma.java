package patika;

import java.util.Scanner;

public class MetotIleUsBulma {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Taban değeri giriniz: ");
        int base = input.nextInt();

        System.out.print("Üs değerini giriniz: ");
        int exponent = input.nextInt();

        System.out.println("Sonuç: " + power(base, exponent));
    }

    static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base * power(base, exponent - 1);
        }
    }
}
