package org.apache.dubbo.demo.consumer.spi;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

/**
 * @author yang
 * @version 1.0.0
 * @ClassName MySPI.java
 * @createTime 2022年03月31日 16:56:00
 */
@SPI
public interface MySPI {

    @Adaptive
    void sayHello(URL url);
}
