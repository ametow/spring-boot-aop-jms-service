package edu.miu.cs.najeeb.spring.eafinal.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class GreeterConsumer {

    @JmsListener(destination = "final-actorName")
    public void consume(String message) {
        System.out.println("Hello " + message);
    }
}
