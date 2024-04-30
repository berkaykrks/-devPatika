package patika;

import java.util.Scanner;

public class YilHesaplama {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan yılı al
        System.out.print("Yıl Giriniz: ");
        int yil = scanner.nextInt();

        // Artık yıl kontrolü
        boolean artikYil = (yil % 4 == 0 && yil % 100 != 0) || (yil % 400 == 0);

        // Sonucu ekrana yazdırma
        if (artikYil) {
            System.out.println(yil + " bir artık yıldır !");
        } else {
            System.out.println(yil + " bir artık yıl değildir !");
        }

        scanner.close();

	}

}
