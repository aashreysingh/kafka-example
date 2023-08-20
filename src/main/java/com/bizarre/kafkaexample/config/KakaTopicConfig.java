package com.bizarre.kafkaexample.config;

import com.bizarre.kafkaexample.constants.ConfigConstants;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KakaTopicConfig {

    @Bean
    public NewTopic bizarreTopic(){
        return TopicBuilder.name(ConfigConstants.GENERIC_TOPIC_NAME).build();
    }
}
