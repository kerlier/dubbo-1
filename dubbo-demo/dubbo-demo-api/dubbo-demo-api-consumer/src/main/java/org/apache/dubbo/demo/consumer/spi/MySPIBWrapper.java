package org.apache.dubbo.demo.consumer.spi;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Wrapper;

/**
 * @author yang
 * @version 1.0.0
 * @ClassName MySPIBWrapper.java
 * @createTime 2022年04月02日 10:18:00
 */
@Wrapper(order = 100)
public class MySPIBWrapper implements MySPI{

    private MySPI mySPI;

    public MySPIBWrapper(MySPI mySPI){
        this.mySPI = mySPI;
    }

    @Override
    public void sayHello(URL url) {
        System.out.println("执行Bwrapper");
        mySPI.sayHello(url);
        System.out.println("执行Bwrapper");
    }
}
