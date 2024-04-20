package patika;

public class odev {

	public class SortAlgorithms {
	    public static void main(String[] args) {
	        // Insertion Sort
	        int[] array1 = {22, 27, 16, 2, 18, 6};
	        System.out.println("Insertion Sort - Unsorted Array:");
	        printArray(array1);
	        insertionSort(array1);
	        System.out.println("Insertion Sort - Sorted Array:");
	        printArray(array1);
	        
	        System.out.println();
	        
	        // Selection Sort (ilk 4 adım)
	        int[] array2 = {7, 3, 5, 8, 2, 9, 4, 15, 6};
	        System.out.println("Selection Sort - Unsorted Array:");
	        printArray(array2);
	        selectionSort(array2);
	        System.out.println("Selection Sort - First 4 Steps of Sorted Array:");
	        printArray(array2);
	    }

	    public static void insertionSort(int[] arr) {
	        int n = arr.length;
	        for (int i = 1; i < n; ++i) {
	            int key = arr[i];
	            int j = i - 1;

	            while (j >= 0 && arr[j] > key) {
	                arr[j + 1] = arr[j];
	                j = j - 1;
	            }
	            arr[j + 1] = key;
	        }
	    }

	    public static void selectionSort(int[] arr) {
	        int n = arr.length;
	        for (int i = 0; i < n - 1; i++) {
	            int minIndex = i;
	            for (int j = i + 1; j < n; j++) {
	                if (arr[j] < arr[minIndex]) {
	                    minIndex = j;
	                }
	            }
	            int temp = arr[minIndex];
	            arr[minIndex] = arr[i];
	            arr[i] = temp;
	        }
	    }

	    public static void printArray(int[] arr) {
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	    }
	}


}
