package interviews;

public class Method_overloading {
    public void add() {
        int a = 12;
        int b = 15;
        int c;
        c = a + b;
        System.out.println(c);
    }

    public void add(int a, int b) {
        int c;
        c = a + b;
        System.out.println(c);
    }

    public void add(int a, double b) {
        double c;
        c = a + b;
        System.out.println(c);
    }
}
class Tester{
    public static void main(String[] args) {
        Method_overloading obj = new Method_overloading();
        obj.add();
        obj.add(10,20);
        obj.add(45,50.5);

    }

}


