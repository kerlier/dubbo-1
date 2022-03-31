package org.apache.dubbo.demo.consumer.spi;

import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

@SPI
public interface MyInnerUrlSPI {

    @Adaptive({"name"})
    void sayHello(InnerURL innerURL);
}
