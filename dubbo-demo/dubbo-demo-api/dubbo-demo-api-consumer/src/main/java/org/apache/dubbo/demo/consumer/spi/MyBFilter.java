package org.apache.dubbo.demo.consumer.spi;

import org.apache.dubbo.common.extension.Activate;
import org.apache.dubbo.rpc.*;

//@Activate
public class MyBFilter implements Filter {
    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        return null;
    }
}
