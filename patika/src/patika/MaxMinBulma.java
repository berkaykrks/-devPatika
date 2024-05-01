package patika;

import java.util.Arrays;

public class MaxMinBulma {

	public static void main(String[] args) {
		 int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
	        int num = 5;

	        Arrays.sort(list);

	        int closestSmaller = Integer.MIN_VALUE;
	        int closestLarger = Integer.MAX_VALUE;

	        for (int i : list) {
	            if (i < num && i > closestSmaller) {
	                closestSmaller = i;
	            }
	            if (i > num && i < closestLarger) {
	                closestLarger = i;
	            }
	        }

	        System.out.println("Girilen sayıdan küçük en yakın sayı: " + closestSmaller);
	        System.out.println("Girilen sayıdan büyük en yakın sayı: " + closestLarger);

	}

}
