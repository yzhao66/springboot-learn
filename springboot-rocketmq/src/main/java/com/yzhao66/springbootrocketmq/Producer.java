package com.yzhao66.springbootrocketmq;

import org.apache.rocketmq.client.producer.DefaultMQProducer;

public class Producer {

    private String producerGroup="test_producer";

    private DefaultMQProducer producer;


    public Producer(){
        producer=new DefaultMQProducer(producerGroup);
//        producer.setVipChannelEnabled();
    }
}
