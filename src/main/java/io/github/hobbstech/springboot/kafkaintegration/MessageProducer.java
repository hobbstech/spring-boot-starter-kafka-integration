package io.github.hobbstech.springboot.kafkaintegration;

public interface MessageProducer {

    void sendMessage(String topic, String message);

    void sendMessage(String topic, Object message);

}
