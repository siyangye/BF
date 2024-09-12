package com.example.coachapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.coachapp")  // Automatically scan for @Component classes
public class ApplicationConfig {

    @Bean
    public String golfCoachSchedule() {
        return "Practice golf for 2 hours";
    }

    @Bean
    public String footballCoachSchedule() {
        return "Practice football for 3 hours";
    }
}

