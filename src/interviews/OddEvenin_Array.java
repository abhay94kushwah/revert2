package interviews;

public class OddEvenin_Array {
    public static void main(String[] args) {
        int arr[] = {2, 8, 6, 7, 1, 4, 9};
        System.out.println("even no. in array ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        System.out.println("odd no. in array ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}