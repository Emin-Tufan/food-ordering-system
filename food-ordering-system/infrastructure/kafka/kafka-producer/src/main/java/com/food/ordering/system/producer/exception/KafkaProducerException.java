package com.food.ordering.system.producer.exception;

public class KafkaProducerException extends RuntimeException {
    public KafkaProducerException(String cause) {
        super(cause);
    }
}
