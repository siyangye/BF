package com.example.coachapp;

public class GolfCoach implements Coach {
    private String schedule;

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    @Override
    public String getDailyWorkOutSchedule() {
        return "Golf Coach: " + schedule;
    }
}

