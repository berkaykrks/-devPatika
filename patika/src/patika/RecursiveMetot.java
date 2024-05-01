package patika;

import java.util.Scanner;

public class RecursiveMetot {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N Sayısı: ");
        int n = scanner.nextInt();

        recursiveFunction(n, n);
    }

    static void recursiveFunction(int originalN, int n) {
        System.out.print(n + " ");
        
        if (n <= 0) {
            if (n == 0)
                recursiveFunction(originalN, n + 5);
            return;
        }

        recursiveFunction(originalN, n - 5);
        if (n < originalN)
            recursiveFunction(originalN, n + 5);
    }
}
