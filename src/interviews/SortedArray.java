package interviews;

import java.util.Arrays;

public class SortedArray {
    public static void main(String[] args) {
        int arr1[] = new int[]{5, 6, 7, 3, 4, 2};
        int size = arr1.length;
        Arrays.sort(arr1);
        System.out.println("sort array" + Arrays.toString(arr1));
        int temp = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] > arr1[j]) {
                    temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }

        }
        System.out.println("Sorted array ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(" " +arr1[i]);
        }


            System.out.println();
            System.out.println("Second largest no " + arr1[size - 2]);


        }
    }

