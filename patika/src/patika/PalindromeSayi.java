package patika;

import java.util.Scanner;

public class PalindromeSayi {
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Bir sayı giriniz: ");
	        int number = input.nextInt();

	        if (isPalindrome(number)) {
	            System.out.println(number + " bir palindromik sayıdır.");
	        } else {
	            System.out.println(number + " bir palindromik sayı değildir.");
	        }
	    }

	    public static boolean isPalindrome(int number) {
	        int reverse = 0;
	        int temp = number;

	        while (temp != 0) {
	            int digit = temp % 10;
	            reverse = reverse * 10 + digit;
	            temp /= 10;
	        }

	        return number == reverse;
	    }
}
