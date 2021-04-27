package com.yzhao66.springbootrocketmq.method1;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 源自 https://blog.csdn.net/qq_34928194/article/details/106575087
 */
@Slf4j
@Component
public class SpringProducer {

    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    public void sendMsg(String topic,String msg){
        log.info("发送报文："+msg);

        this.rocketMQTemplate.convertAndSend(topic, msg);
    }
}
