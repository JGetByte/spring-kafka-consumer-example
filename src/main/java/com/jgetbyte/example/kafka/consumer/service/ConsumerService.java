package com.jgetbyte.example.kafka.consumer.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ConsumerService {

    @KafkaListener(topics = "${kafka.topic}")
    public void receive(String payload) {
        log.info("received payload= [{}]", payload);

    }

}
