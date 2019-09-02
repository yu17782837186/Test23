package cn.com.thread;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class TestThreadDownLoad implements Runnable{
    private String url;
    private String name;
    public TestThreadDownLoad() {

    }
    public TestThreadDownLoad(String url,String name) {
        this.url = url;
        this.name = name;
    }
    @Override
    public void run() {
       TestThreadDownLoad ttd = new TestThreadDownLoad();
       ttd.downLoad(url,name);
    }
    public void downLoad(String url,String name) {
        try {
            FileUtils.copyURLToFile(new URL(url),new File(name));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("图片下载失败");
        }
    }

    public static void main(String[] args) {
        TestThreadDownLoad ttd1 = new TestThreadDownLoad("http://pic29.nipic.com/20130524/4315455_191911076000_2.jpg","2.jpg");
        TestThreadDownLoad ttd2 = new TestThreadDownLoad("http://pic38.nipic.com/20140212/4499633_002456048336_2.jpg","3.jpg");
        new Thread(ttd1).start();
        new Thread(ttd2).start();
        //FileUtils.deleteQuietly(new File("F:/java code/thread01/2.jpg"));
    }
}
