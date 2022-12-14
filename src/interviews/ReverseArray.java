package interviews;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[]=new int[] {1,8,6,9};
        System.out.println("Reverse Array :");

        for(int i=arr.length-1;i>=0;i--){
            System.out.print(" "+arr[i]);
        }
    }
}
