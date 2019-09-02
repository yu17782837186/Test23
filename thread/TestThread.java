package cn.com.thread;

public class TestThread extends Thread{
    //方法一：继承Thread类 重写run方法，调用对象的start()
    //run()是线程的入口点
    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("一边学习");
        }
    }

    public static void main(String[] args) {
        //创建子类对象
        TestThread tt = new TestThread();
        //启动
        tt.start(); //不保证立即运行，由cpu调用
        for (int i = 0; i < 200; i++) {
            System.out.println("努力敲代码");
        }
    }
}
