package interviews;

public class Hacker {
    public static void main(String[] args) {

        Hacker h1=new Hacker();
        Hacker h2=new Hacker();
        Hacker h3=h1;

        System.out.println(h1==h3);
        System.out.println(h1==h2);
        System.out.println(h1.equals(h2));
    }
}
