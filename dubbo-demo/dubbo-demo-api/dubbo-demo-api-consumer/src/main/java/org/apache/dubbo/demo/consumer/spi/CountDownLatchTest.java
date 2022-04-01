package org.apache.dubbo.demo.consumer.spi;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {

    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(0);
        latch.countDown();

        System.out.println("xxxxxxxxx");
    }
}
