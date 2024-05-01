package patika;

import java.util.HashMap;

public class DizideTekrarEdenSayilariBulma {
	public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 5, 2, 6, 4, 7, 8, 9, 3, 4, 6, 8, 10};
        findDuplicatePairs(numbers);
    }

    public static void findDuplicatePairs(int[] arr) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Dizideki sayıların frekansını hesapla
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Frekansı 1'den büyük olan çift sayıları bul ve yazdır
        System.out.println("Tekrar eden çift sayılar:");
        for (int num : frequencyMap.keySet()) {
            int frequency = frequencyMap.get(num);
            if (num % 2 == 0 && frequency > 1) {
                System.out.println(num + " (Frekans: " + frequency + ")");
            }
        }
    }
}
