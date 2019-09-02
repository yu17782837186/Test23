package cn.com.thread;

public class TestThread2 implements Runnable{
    //方法二：实现Runnable接口，重写run方法
    //由实现类调用start方法
    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("一边玩耍");
        }
    }

    public static void main(String[] args) {
        TestThread2 ts = new TestThread2();
        Thread t = new Thread(ts);
        t.start();
        //new Thread(new TestThread2()).start();
        for (int i = 0; i < 200; i++) {
            System.out.println("一边学习");
        }
    }
}
