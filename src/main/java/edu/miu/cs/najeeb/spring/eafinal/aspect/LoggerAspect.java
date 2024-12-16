package edu.miu.cs.najeeb.spring.eafinal.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAspect {

    @Before("execution(* edu.miu.cs.najeeb.spring.eafinal.service.ActorService.findById(..))")
    public void logService(){
        System.out.println("service request made");
    }

    @Before("execution(* edu.miu.cs.najeeb.spring.eafinal.controller.ActorController.findById(..))")
    public void logController(){
        System.out.println("controller request made");
    }
}
