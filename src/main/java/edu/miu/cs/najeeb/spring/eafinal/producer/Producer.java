package edu.miu.cs.najeeb.spring.eafinal.producer;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class Producer {

    private JmsTemplate jmsTemplate;

    public Producer(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    public void produceMessage(String destination, String message) {
        jmsTemplate.send(destination, session -> session.createTextMessage(message));
    }
}
