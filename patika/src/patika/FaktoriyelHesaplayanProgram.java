package patika;

import java.util.Scanner;

public class FaktoriyelHesaplayanProgram {

	
    public static int faktoriyel(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * faktoriyel(n - 1);
        }
    }

    // Kombinasyon hesaplama metodu
    public static int kombinasyon(int n, int r) {
        return faktoriyel(n) / (faktoriyel(r) * faktoriyel(n - r));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n'i giriniz: ");
        int n = scanner.nextInt();
        System.out.print("r'yi giriniz: ");
        int r = scanner.nextInt();

        // Kombinasyonu hesapla ve ekrana yazdır
        int sonuc = kombinasyon(n, r);
        System.out.println("C(" + n + ", " + r + ") = " + sonuc);

        scanner.close();
    }
}
