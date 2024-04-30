package patika;

import java.util.Scanner;

public class KullaniciGiris {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        String dogruSifre = "12345"; // Örnek doğru şifre
        String kullaniciSifre;

        System.out.println("Şifrenizi girin:");
        kullaniciSifre = scanner.nextLine();

        if (!kullaniciSifre.equals(dogruSifre)) {
            System.out.println("Girdiğiniz şifre yanlış.");
            System.out.println("Şifrenizi sıfırlamak ister misiniz? (E/H)");
            String cevap = scanner.nextLine();

            if (cevap.equalsIgnoreCase("E")) {
                System.out.println("Yeni şifrenizi girin:");
                String yeniSifre = scanner.nextLine();

                if (!yeniSifre.equals(dogruSifre)) {
                    System.out.println("Şifre oluşturuldu.");
                } else {
                    System.out.println("Yeni şifreniz eski şifrenizle aynı olamaz.");
                    System.out.println("Şifre oluşturulamadı, lütfen başka bir şifre giriniz.");
                }
            } else {
                System.out.println("Şifre sıfırlama işlemi iptal edildi.");
            }
        } else {
            System.out.println("Girdiğiniz şifre doğru.");
        }

        scanner.close();

	}

}
