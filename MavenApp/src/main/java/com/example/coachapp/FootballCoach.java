package com.example.coachapp;

public class FootballCoach implements Coach {
    private String schedule;

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    @Override
    public String getDailyWorkOutSchedule() {
        return schedule;
    }
}
