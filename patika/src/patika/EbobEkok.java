package patika;

import java.util.Scanner;

public class EbobEkok {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz: ");
        int num1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int num2 = input.nextInt();

        int ebob = findEBOB(num1, num2);
        int ekok = findEKOK(num1, num2, ebob);

        System.out.println("Girilen sayıların EBOB'u: " + ebob);
        System.out.println("Girilen sayıların EKOK'u: " + ekok);
    }

    public static int findEBOB(int num1, int num2) {
        while (num1 != num2) {
            if (num1 > num2)
                num1 -= num2;
            else
                num2 -= num1;
        }
        return num1;
    }

    public static int findEKOK(int num1, int num2, int ebob) {
        return (num1 * num2) / ebob;
    }
}
