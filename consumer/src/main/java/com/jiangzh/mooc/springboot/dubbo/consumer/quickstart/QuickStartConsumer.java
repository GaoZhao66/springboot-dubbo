package com.jiangzh.mooc.springboot.dubbo.consumer.quickstart;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jiangzh.mooc.springboot.dubbo.ServiceAPI;
import org.springframework.stereotype.Component;

@Component
public class QuickStartConsumer {

    @Reference(interfaceClass = ServiceAPI.class)
    ServiceAPI serviceAPI;

    public void sendMessage(String message){
        System.out.println(serviceAPI.sendMessage(message));
    }

}
