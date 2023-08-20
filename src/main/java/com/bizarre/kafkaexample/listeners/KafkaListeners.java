package com.bizarre.kafkaexample.listeners;

import com.bizarre.kafkaexample.constants.ConfigConstants;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = ConfigConstants.GENERIC_TOPIC_NAME,
            groupId = "groupId"
    )
    void listener(String data){
        System.out.println("Listener Received: " + data + " 🎉");
    }

}
