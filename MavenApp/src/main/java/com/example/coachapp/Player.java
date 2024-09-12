package com.example.coachapp;

public class Player {

    private Coach tennisCoach;
    private Coach golfCoach;
    private Coach footballCoach;

    // Constructor for TennisCoach
    public Player(Coach tennisCoach) {
        this.tennisCoach = tennisCoach;
    }

    // Setter for GolfCoach
    public void setGolfCoach(Coach golfCoach) {
        this.golfCoach = golfCoach;
    }

    // Setter for FootballCoach (as Field Injection is not supported in XML)
    public void setFootballCoach(Coach footballCoach) {
        this.footballCoach = footballCoach;
    }

    public void getWorkoutSchedules() {
        System.out.println(tennisCoach.getDailyWorkOutSchedule());
        System.out.println(golfCoach.getDailyWorkOutSchedule());
        System.out.println(footballCoach.getDailyWorkOutSchedule());
    }
}
