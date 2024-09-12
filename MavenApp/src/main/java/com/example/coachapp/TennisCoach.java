package com.example.coachapp;

import java.util.Random;

public class TennisCoach implements Coach {

    private String[] schedules;

    public TennisCoach(String[] schedules) {
        this.schedules = schedules;
    }

    @Override
    public String getDailyWorkOutSchedule() {
        // Returns a random schedule from the array
        Random random = new Random();
        return schedules[random.nextInt(schedules.length)];
    }
}
