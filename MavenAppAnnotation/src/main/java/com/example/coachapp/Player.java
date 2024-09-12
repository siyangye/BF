package com.example.coachapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Player {

    private Coach tennisCoach;
    private Coach golfCoach;
    private Coach footballCoach;

    @Autowired
    public Player(Coach tennisCoach) {
        this.tennisCoach = tennisCoach;
    }

    @Autowired
    public void setGolfCoach(Coach golfCoach) {
        this.golfCoach = golfCoach;
    }

    @Autowired
    public void setFootballCoach(Coach footballCoach) {
        this.footballCoach = footballCoach;
    }

    public void getWorkoutSchedules() {
        System.out.println(tennisCoach.getDailyWorkOutSchedule());
        System.out.println(golfCoach.getDailyWorkOutSchedule());
        System.out.println(footballCoach.getDailyWorkOutSchedule());
    }
}
