package com.example.coachapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ApplicationConfig.class);

        Player player = context.getBean("player", Player.class);

        player.getWorkoutSchedules();

        context.close();
    }
}
