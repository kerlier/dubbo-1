package org.apache.dubbo.demo.consumer.spi;

import java.util.concurrent.CountDownLatch;

/**
 * @author yang
 * @version 1.0.0
 * @ClassName CountDownTest.java
 * @createTime 2022年04月02日 10:52:00
 */
public class CountDownTest {
    public static void main(String[] args) {

        CountDownLatch countDownLatch = new CountDownLatch(0);
        new Thread(()->{
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
            countDownLatch.countDown();
            System.out.println("线程1执行");
        }).start();

        new Thread(()->{
            countDownLatch.countDown();
            System.out.println("线程2执行");
        }).start();
        System.out.println("countDownLatch为0默认就跳过了");
    }
}
