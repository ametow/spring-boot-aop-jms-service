package edu.miu.cs.najeeb.spring.eafinal.controller;

import edu.miu.cs.najeeb.spring.eafinal.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {

    @Autowired
    private CommonService commonService;

    @GetMapping("/rand")
    public String randomDay() {
        return commonService.randomDay();
    }
}
