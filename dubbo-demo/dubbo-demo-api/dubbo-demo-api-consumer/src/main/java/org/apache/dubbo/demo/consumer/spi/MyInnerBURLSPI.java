package org.apache.dubbo.demo.consumer.spi;

public class MyInnerBURLSPI implements MyInnerUrlSPI {
    @Override
    public void sayHello(InnerURL innerURL) {
        System.out.println("BBBB");
    }
}
