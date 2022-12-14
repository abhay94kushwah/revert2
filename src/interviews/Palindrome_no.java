package interviews;

public class Palindrome_no {
    public static void main(String[] args) {
        int n = 343, temp, sum = 0, rem;// a no. that is same after we reverse it..
        temp = n;
        while (n > 0) {
            rem = n % 10;
            n = n / 10;
            sum = (sum * 10) + rem;
        }
        if (temp == sum) {
            System.out.println("Palindrome no.");
        } else {
            System.out.println("Not a palindrome no.");
        }
    }
}
