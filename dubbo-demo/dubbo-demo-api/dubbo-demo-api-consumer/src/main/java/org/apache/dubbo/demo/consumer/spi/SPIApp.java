package org.apache.dubbo.demo.consumer.spi;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.rpc.*;
import org.apache.dubbo.rpc.cluster.directory.StaticDirectory;
import org.apache.dubbo.rpc.cluster.support.FailbackClusterInvoker;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yang
 * @version 1.0.0
 * @ClassName SPIApp.java
 * @createTime 2022年03月31日 16:57:00
 */
public class SPIApp {
    public static void main(String[] args) {
        MySPI adaptiveExtension = ExtensionLoader.getExtensionLoader(MySPI.class).getAdaptiveExtension();
        adaptiveExtension.sayHello(URL.valueOf("http://localhst:8080"));

//        MySPI adaptiveExtension = ExtensionLoader.getExtensionLoader(MySPI.class).getAdaptiveExtension();
//        adaptiveExtension.sayHello(URL.valueOf("http://localhst:8080"));
////        adaptiveExtension.sayHello(URL.valueOf("http://localhst:8080?A=A"));
//        System.out.println(adaptiveExtension.getClass());
//
//        MyInnerUrlSPI adaptiveExtension1 = ExtensionLoader.getExtensionLoader(MyInnerUrlSPI.class).getAdaptiveExtension();
//        InnerURL innerURL = new InnerURL();
//        innerURL.setUrl(URL.valueOf("http://localhst:8080?name=b"));
//        adaptiveExtension1.sayHello(innerURL);
//
//        List<Filter> activateExtensions = ExtensionLoader.getExtensionLoader(Filter.class).getActivateExtensions();
//        for (Filter activateExtension : activateExtensions) {
//            System.out.println(activateExtension.getClass());
//        }

//        adaptiveExtension2.invoke(new Invoker<String>() {
//            @Override
//            public Class<String> getInterface() {
//                return null;
//            }
//
//            @Override
//            public Result invoke(Invocation invocation) throws RpcException {
//                return null;
//            }
//
//            @Override
//            public URL getUrl() {
//                return URL.valueOf("http://127.0.0.1:8080?proxy=jdk");
//            }
//
//            @Override
//            public boolean isAvailable() {
//                return false;
//            }
//
//            @Override
//            public void destroy() {
//
//            }
//        }, null);
//        System.out.println(adaptiveExtension1.getClass());
    }
}
