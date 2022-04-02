package org.apache.dubbo.demo.consumer.spi;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Wrapper;

/**
 * @author yang
 * @version 1.0.0
 * @ClassName MySPIWrapper.java
 * @createTime 2022年04月02日 10:15:00
 */
@Wrapper(order = 2)
public class MySPIWrapper implements MySPI{

    private MySPI mySPI;

    public MySPIWrapper(MySPI mySPI){
        this.mySPI = mySPI;
    }

    @Override
    public void sayHello(URL url) {
        System.out.println("执行MySPIWrapper1");
        mySPI.sayHello(url);
        System.out.println("执行MySPIWrapper2");

    }
}
