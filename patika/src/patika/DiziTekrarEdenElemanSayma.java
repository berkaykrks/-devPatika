package patika;

import java.util.HashMap;
import java.util.Map;

public class DiziTekrarEdenElemanSayma {

	public static void main(String[] args) {
		 int[] array = {10, 20, 20, 10, 10, 20, 5, 20};

	        // Frekansları tutmak için bir HashMap oluştur
	        Map<Integer, Integer> frequencyMap = new HashMap<>();

	        // Dizideki her elemanın frekansını hesapla
	        for (int num : array) {
	            if (frequencyMap.containsKey(num)) {
	                frequencyMap.put(num, frequencyMap.get(num) + 1);
	            } else {
	                frequencyMap.put(num, 1);
	            }
	        }

	        // Sonuçları ekrana yazdır
	        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
	            System.out.println(entry.getKey() + " sayısı " + entry.getValue() + " kere tekrar edildi.");
	        }

	}

}
