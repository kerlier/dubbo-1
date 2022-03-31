package org.apache.dubbo.demo.consumer.spi;

import org.apache.dubbo.common.extension.ExtensionLoader;

/**
 * @author yang
 * @version 1.0.0
 * @ClassName SPIApp.java
 * @createTime 2022年03月31日 16:57:00
 */
public class SPIApp {
    public static void main(String[] args) {
        MySPI adaptiveExtension = ExtensionLoader.getExtensionLoader(MySPI.class).getExtension("A");
        System.out.println(adaptiveExtension.getClass());
    }
}
