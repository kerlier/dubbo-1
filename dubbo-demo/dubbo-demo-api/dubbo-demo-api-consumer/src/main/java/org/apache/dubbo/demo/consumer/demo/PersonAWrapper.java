package org.apache.dubbo.demo.consumer.demo;

import org.apache.dubbo.common.extension.Wrapper;

/**
 * @author yang
 * @version 1.0.0
 * @ClassName PersonWrapper.java
 * @createTime 2022年04月02日 15:37:00
 */
@Wrapper(order = 2)
public class PersonAWrapper implements Person{

    private Person person;

    public PersonAWrapper(Person person){
        this.person = person;
    }

    @Override
    public String sayHello() {
        System.out.println("先执行PersonAWrapper");
        return person.sayHello() + "Person22Wrapper";
    }
}
