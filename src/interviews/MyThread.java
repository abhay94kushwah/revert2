package interviews;


class MyThread1 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<100)
        System.out.println("thread1 is working");
        i++;
    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<100)
        System.out.println("thread2 is running");
        i++;
    }
}
public class MyThread {
    public static void main(String[] args) {
        MyThread1 t1=new MyThread1();
        MyThread2 t2=new MyThread2();
        t1.start();
        t2.start();

    }

}
