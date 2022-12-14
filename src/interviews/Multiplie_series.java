package interviews;

public class Multiplie_series {
    public static void main(String[] args) {
        int n1=1,n2=2,multi,count=7;
        System.out.print(n1+","+n2);
        for(int i=2;i<count;i++){
            multi=n1*n2;
            System.out.print(","+multi);
            n1=n2;
            n2=multi;
        }
    }
}
