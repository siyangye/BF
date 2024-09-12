package com.example.coachapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {
    public static void main(String[] args) {
        // Load the Spring context from applicationContext.xml
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve the Player bean
        Player player = context    .getBean("player", Player.class);

        // Call the method to display workout schedules
        player.getWorkoutSchedules();

        // Close the context
        context.close();
    }
}
