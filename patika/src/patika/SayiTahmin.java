package patika;

import java.util.Random;
import java.util.Scanner;

public class SayiTahmin {

	public class Main {
	    public static void main(String[] args) {
	    	Random random = new Random();
	        int secretNumber = random.nextInt(100); // 0 ile 99 arasında rastgele bir sayı seç

	        Scanner scanner = new Scanner(System.in);
	        int remainingAttempts = 5;
	        boolean isWin = false;

	        System.out.println("0 ile 99 arasında bir sayı tahmin edin. Toplam 5 hakkınız var.");

	        while (remainingAttempts > 0) {
	            System.out.print("Tahmininiz: ");
	            int guess = scanner.nextInt();

	            if (guess < 0 || guess > 99) {
	                System.out.println("Lütfen 0 ile 99 arasında bir sayı girin.");
	                continue;
	            }

	            if (guess == secretNumber) {
	                isWin = true;
	                break;
	            } else if (guess < secretNumber) {
	                System.out.println("Daha büyük bir sayı girin.");
	            } else {
	                System.out.println("Daha küçük bir sayı girin.");
	            }

	            remainingAttempts--;
	            System.out.println("Kalan deneme hakkınız: " + remainingAttempts);
	        }

	        if (isWin) {
	            System.out.println("Tebrikler! Gizli sayıyı doğru tahmin ettiniz: " + secretNumber);
	        } else {
	            System.out.println("Üzgünüm, tüm deneme hakkınızı kullandınız. Gizli sayı: " + secretNumber);
	        }

	        scanner.close();
	    }
	}

}
