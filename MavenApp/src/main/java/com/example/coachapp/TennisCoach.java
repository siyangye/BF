package com.example.coachapp;

import java.io.*;
import java.util.*;

public class TennisCoach implements Coach {

    private List<String> schedules;

    public TennisCoach() {
        this.schedules = new ArrayList<>();
    }

    // This method will be called as part of the post-initialization
    public void loadSchedulesFromFile() {
        // Load the schedule from the file in the resources folder
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(getClass().getResourceAsStream("/tennis-schedule.txt")))) {

            if (reader == null) {
                throw new IOException("File not found: /tennis-schedule.txt");
            }

            String line;
            while ((line = reader.readLine()) != null) {
                schedules.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getDailyWorkOutSchedule() {
        // Return a random schedule from the list
        if (!schedules.isEmpty()) {
            Random random = new Random();
            return "Tennis Coach: " + schedules.get(random.nextInt(schedules.size()));
        } else {
            return "No schedule available";
        }
    }
}
