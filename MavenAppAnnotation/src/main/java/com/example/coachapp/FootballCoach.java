package com.example.coachapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {

    @Autowired
    @Qualifier("footballCoachSchedule")
    private String schedule;

    @Override
    public String getDailyWorkOutSchedule() {
        return "Football Coach: " + schedule;
    }
}
