package patika;

import java.util.Scanner;

public class NumMinMax {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);

	        System.out.print("Kaç tane sayı gireceksiniz: ");
	        int n = input.nextInt();

	        int min = Integer.MAX_VALUE;
	        int max = Integer.MIN_VALUE;

	        for (int i = 1; i <= n; i++) {
	            System.out.print(i + ". Sayıyı giriniz: ");
	            int num = input.nextInt();
	            if (num < min) {
	                min = num;
	            }
	            if (num > max) {
	                max = num;
	            }
	        }

	        System.out.println("En büyük sayı: " + max);
	        System.out.println("En küçük sayı: " + min);

	}

}
