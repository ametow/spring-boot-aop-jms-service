package edu.miu.cs.najeeb.spring.eafinal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
@EnableAspectJAutoProxy
public class EaFinalApplication {

    public static void main(String[] args) {
        SpringApplication.run(EaFinalApplication.class, args);
    }

}
