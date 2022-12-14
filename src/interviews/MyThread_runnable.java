package interviews;

class MyThread3 implements Runnable {
    public void run() {
        //int i = 0;
        while (true) {
            System.out.println("I Love You.");
            //i++;
        }
    }
}
        class MyThread4 implements Runnable {
            public void run() {
                //int i = 0;
                while (true) {
                    System.out.println("I Love You too.");
                    //i++;
                }
            }
        }

public class MyThread_runnable {
    public static void main(String[] args) {
        MyThread3 t3=new MyThread3();

        Thread t1=new Thread(t3);

        MyThread4 t4=new MyThread4();

        Thread t2=new Thread(t4);

        t1.start();
        t2.start();


    }
}
