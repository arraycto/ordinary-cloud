package com.me.ordinarycloud.eureka.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceRegisteredEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class EurekaRegisterListener {

    @EventListener
    public void register(EurekaInstanceRegisteredEvent eurekaInstanceRegisteredEvent){
        log.info("微服务初始化信息："+eurekaInstanceRegisteredEvent.getInstanceInfo().toString());
    }

}
