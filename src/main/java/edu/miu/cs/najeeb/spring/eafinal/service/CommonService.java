package edu.miu.cs.najeeb.spring.eafinal.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommonService {
    private List<String> days = new ArrayList<>(List.of("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));

    public String randomDay() {
        return days.get((int) (Math.random() * 7));
    }
}
