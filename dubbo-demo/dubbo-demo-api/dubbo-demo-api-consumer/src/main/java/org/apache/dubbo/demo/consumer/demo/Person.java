package org.apache.dubbo.demo.consumer.demo;

import org.apache.dubbo.common.extension.SPI;

/**
 * @author yang
 * @version 1.0.0
 * @ClassName Person.java
 * @createTime 2022年04月02日 15:36:00
 */
@SPI(value="default")
public interface Person {
    String sayHello();
}
