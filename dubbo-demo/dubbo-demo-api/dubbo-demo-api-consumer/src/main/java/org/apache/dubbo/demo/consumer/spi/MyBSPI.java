package org.apache.dubbo.demo.consumer.spi;

import org.apache.dubbo.common.URL;

/**
 * @author yang
 * @version 1.0.0
 * @ClassName MyASPI.java
 * @createTime 2022年03月31日 16:57:00
 */
public class MyBSPI implements MySPI{
    @Override
    public void sayHello(URL url) {
        System.out.println("答应B");
    }
}
