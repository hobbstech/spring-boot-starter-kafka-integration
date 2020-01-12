package io.github.hobbstech.springboot.kafkaintegration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;


@Component
@Slf4j
public class KafkaMessageProducerImpl implements MessageProducer {

    private final KafkaTemplate<String, Object> kafkaTemplate;

    public KafkaMessageProducerImpl(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String topic, String message) {
        log.debug(String.format("#### -> Producing message -> %s", message));
        this.kafkaTemplate.send(topic, message);
    }

    public void sendMessage(String topic, Object message) {
        log.debug(String.format("#### -> Producing message -> %s", message));
        this.kafkaTemplate.send(topic, message);
    }
}
