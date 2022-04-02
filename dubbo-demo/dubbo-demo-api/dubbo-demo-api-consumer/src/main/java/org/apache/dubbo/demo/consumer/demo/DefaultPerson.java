package org.apache.dubbo.demo.consumer.demo;

/**
 * @author yang
 * @version 1.0.0
 * @ClassName DefaultPerson.java
 * @createTime 2022年04月02日 15:37:00
 */
public class DefaultPerson implements Person{
    @Override
    public String sayHello() {
        System.out.println("AAA");
        return "nihao";
    }
}
