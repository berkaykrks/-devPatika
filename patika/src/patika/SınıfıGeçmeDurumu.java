package patika;

import java.util.Scanner;

public class SınıfıGeçmeDurumu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        String[] dersler = {"Matematik", "Fizik", "Türkçe", "Kimya", "Müzik"};
        int[] notlar = new int[5];

        // Notları kullanıcıdan al
        for (int i = 0; i < dersler.length; i++) {
            System.out.println(dersler[i] + " notunu girin (0-100 arası):");
            int not = scanner.nextInt();

            // Notların 0-100 arasında olup olmadığını kontrol et
            if (not >= 0 && not <= 100) {
                notlar[i] = not;
            }
        }

        // Geçme notu
        int gecmeNotu = 55;

        // Notların ortalamasını hesapla
        int toplam = 0;
        int notSayisi = 0;
        for (int not : notlar) {
            if (not != 0 && not != 100) { // 0 veya 100 değilse ortalamaya katıl
                toplam += not;
                notSayisi++;
            }
        }

        if (notSayisi == 0) {
            System.out.println("Ortalama hesaplanamadı, geçme notu alınmadı.");
        } else {
            double ortalama = (double) toplam / notSayisi;
            System.out.println("Ortalama: " + ortalama);

            // Ortalama geçme notundan büyük veya eşitse geçti, değilse kaldı
            String durum = (ortalama >= gecmeNotu) ? "Geçti" : "Kaldı";
            System.out.println("Durum: " + durum);
        }

        scanner.close();

	}

}
