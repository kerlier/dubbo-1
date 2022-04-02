package org.apache.dubbo.demo.consumer.demo;

import org.apache.dubbo.common.extension.ExtensionLoader;

/**
 * @author yang
 * @version 1.0.0
 * @ClassName App.java
 * @createTime 2022年04月02日 15:39:00
 */
public class App {
    public static void main(String[] args) {
        Person adaptiveExtension = ExtensionLoader.getExtensionLoader(Person.class).getDefaultExtension();
        System.out.println(adaptiveExtension.sayHello());
    }
}
