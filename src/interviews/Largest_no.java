package interviews;

public class Largest_no {
    public static void main(String[] args) {
        int arr[] = new int[]{85, 35, 45, 98, 145, 78};
        int max = arr[0];


        for (int i=1; i<arr.length; i++) {
            if (arr[i]>max) {
                max=arr[i];
            }
        }
        System.out.println("Largest no :" +max);
    }
}
