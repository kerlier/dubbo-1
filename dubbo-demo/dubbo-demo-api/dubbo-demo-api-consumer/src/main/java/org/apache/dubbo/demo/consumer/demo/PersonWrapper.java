package org.apache.dubbo.demo.consumer.demo;

import org.apache.dubbo.common.extension.Wrapper;

/**
 * @author yang
 * @version 1.0.0
 * @ClassName PersonWrapper.java
 * @createTime 2022年04月02日 15:37:00
 */
@Wrapper(order = 1)
public class PersonWrapper implements Person{

    private Person person;

    public PersonWrapper(Person person){
        this.person = person;
    }

    @Override
    public String sayHello() {
        System.out.println("先执行PersonWrapper");
        return person.sayHello() + "PersonWrapper";
    }
}
