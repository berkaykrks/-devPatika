package patika;

import java.util.Scanner;

public class NotOrtalamasiHesapla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan sınav puanlarını al
        System.out.println("Matematik sınav puanını girin:");
        int matematik = scanner.nextInt();

        System.out.println("Fizik sınav puanını girin:");
        int fizik = scanner.nextInt();

        System.out.println("Kimya sınav puanını girin:");
        int kimya = scanner.nextInt();

        System.out.println("Türkçe sınav puanını girin:");
        int turkce = scanner.nextInt();

        System.out.println("Tarih sınav puanını girin:");
        int tarih = scanner.nextInt();

        System.out.println("Müzik sınav puanını girin:");
        int muzik = scanner.nextInt();

        // Not ortalamasını hesapla
        double ortalama = (matematik + fizik + kimya + turkce + tarih + muzik) / 6.0;

        // Sınıfı geçme durumunu kontrol et ve ekrana bastır
        String durum = ortalama >= 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println("Ortalamanız: " + ortalama);
        System.out.println("Durum: " + durum);

        scanner.close();
    }
}
