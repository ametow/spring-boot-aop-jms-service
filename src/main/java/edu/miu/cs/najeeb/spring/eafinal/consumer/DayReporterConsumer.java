package edu.miu.cs.najeeb.spring.eafinal.consumer;

import edu.miu.cs.najeeb.spring.eafinal.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class DayReporterConsumer {

    @Autowired
    private CommonService commonService;

    @JmsListener(destination = "final-actorName")
    public void consume(String message) {
        System.out.println(message+"'s day off is " + commonService.randomDay());
    }
}
