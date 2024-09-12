package com.example.coachapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GolfCoach implements Coach {

    private String schedule;

    @Autowired
    @Qualifier("golfCoachSchedule")
    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    @Override
    public String getDailyWorkOutSchedule() {
        return "Golf Coach: " + schedule;
    }
}
