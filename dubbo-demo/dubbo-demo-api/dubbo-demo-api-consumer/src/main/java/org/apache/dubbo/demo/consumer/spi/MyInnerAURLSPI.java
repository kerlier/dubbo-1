package org.apache.dubbo.demo.consumer.spi;

import org.apache.dubbo.common.extension.Activate;

@Activate(value = "A")
public class MyInnerAURLSPI implements MyInnerUrlSPI {
    @Override
    public void sayHello(InnerURL innerURL) {
        System.out.println("AAAA");
    }
}
