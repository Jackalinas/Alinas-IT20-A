/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Arrays;
public class SortingAlgorithmsJava {
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {

        int[] original = {
            45, 12, 89, 3, 67, 21, 10, 54, 32, 7
        };

       
        int[] bubble = Arrays.copyOf(original, original.length);
        int[] selection = Arrays.copyOf(original, original.length);
        int[] insertion = Arrays.copyOf(original, original.length);

        System.out.println("ORIGINAL ARRAY:");
        System.out.println(Arrays.toString(original));

        bubbleSort(bubble);
        System.out.println("BUBBLE SORT:");
        System.out.println(Arrays.toString(bubble));

        selectionSort(selection);
        System.out.println("SELECTION SORT:");
        System.out.println(Arrays.toString(selection));

        insertionSort(insertion);
        System.out.println("INSERTION SORT:");
        System.out.println(Arrays.toString(insertion));
    }
}
