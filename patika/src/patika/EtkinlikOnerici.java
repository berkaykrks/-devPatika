package patika;

import java.util.Scanner;

public class EtkinlikOnerici {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen sıcaklık değerini girin:");
        int sicaklik = scanner.nextInt();

        if (sicaklik < 5) {
            System.out.println("Sıcaklık çok düşük, Kayak yapmayı öneririz.");
        } else if (sicaklik < 15) {
            System.out.println("Sıcaklık uygun, Sinema etkinliğini öneririz.");
        } else if (sicaklik < 25) {
            System.out.println("Sıcaklık ideal, Piknik etkinliğini öneririz.");
        } else {
            System.out.println("Sıcaklık yüksek, Yüzme etkinliğini öneririz.");
        }

        scanner.close();

	}

}
