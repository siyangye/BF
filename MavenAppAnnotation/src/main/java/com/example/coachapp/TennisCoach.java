package com.example.coachapp;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;



@Component
public class TennisCoach implements Coach {

    private List<String> schedules;

    public TennisCoach() {
        this.schedules = new ArrayList<>();
    }

    @PostConstruct
    public void loadSchedulesFromFile() {
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
        if (!schedules.isEmpty()) {
            Random random = new Random();
            return "Tennis Coach: " + schedules.get(random.nextInt(schedules.size()));
        } else {
            return "Tennis Coach: No schedule available";
        }
    }
}
