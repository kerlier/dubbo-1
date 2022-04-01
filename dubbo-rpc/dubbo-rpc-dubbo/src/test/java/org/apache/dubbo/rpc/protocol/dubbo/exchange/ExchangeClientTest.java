package org.apache.dubbo.rpc.protocol.dubbo.exchange;

import org.apache.dubbo.remoting.exchange.ExchangeClient;
import org.junit.jupiter.api.Test;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExchangeClientTest {

    @Test
    public void testCompletableFuture(){
        CompletableFuture<String> future = new CompletableFuture<>();
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(()->{
            try{
                Thread.sleep(5000);
            }catch (Exception e){
                e.printStackTrace();
            }
            future.complete("nihao");
        });

        try{
            //YTODO completableFuture在执行complete方法之前，都是阻塞的
//            String s = future.get();
//            System.out.println(s);

            //YTODO completableFuture获取结果后，可以再加上一个函数，使用thenApply
            CompletableFuture<String> future1 = future.thenApply((x) -> {
                return x +"xxxx";
            });
            System.out.println(future1.get());
        }catch (Exception e){
            e.printStackTrace();
        }

    }



    @Test
    public void testSendResult(){


    }
}
