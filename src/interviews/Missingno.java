package interviews;

public class Missingno {
    public static void main(String[] args) {
        int[] arr= new int[]{1,2,3,4,5,6,7,8,9,11};
        int sum=0;
        int n= arr.length;
        System.out.println("length of array "+n);

        int totalsum=(n+1)*(n+2)/2;
        System.out.println("sum of all no. "+totalsum);

        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        int missingnumber=totalsum-sum;
        System.out.println("missing number "+missingnumber);
    }
}
