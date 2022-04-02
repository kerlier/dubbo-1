package org.apache.dubbo.demo.consumer.spi;

import java.lang.reflect.Constructor;

/**
 * @author yang
 * @version 1.0.0
 * @ClassName ClassApp.java
 * @createTime 2022年04月02日 10:22:00
 */
public class ClassApp {

    public static void main(String[] args) throws NoSuchMethodException {

        //获取类中的构造器
        Class<MySPIBWrapper> mySPIBWrapperClass = MySPIBWrapper.class;

        Constructor<MySPIBWrapper> constructor = mySPIBWrapperClass.getConstructor(MySPI.class);
        System.out.println(constructor);
    }
}
