package interviews;

public class Squeroot {
    public static void main(String[] args) {
        int n = 121;

        double sr=Math.sqrt(49);
        System.out.println("squeroot of the number is "+sr);

        double temp;
        double sq = n / 2;

        do {
            temp=sq;
            sq=(temp+(n/temp))/2;

        }while (temp-sq!=0);
        System.out.println("squeroot of the n is "+sq);

    }
}
