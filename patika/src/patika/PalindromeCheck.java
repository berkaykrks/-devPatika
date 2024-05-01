package patika;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir kelime girin: ");
        String word = scanner.nextLine();

        if (isPalindrome(word)) {
            System.out.println(word + " bir palindromiktir.");
        } else {
            System.out.println(word + " bir palindromik değildir.");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
