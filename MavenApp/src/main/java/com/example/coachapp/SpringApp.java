package com.example.coachapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Player player = context    .getBean("player", Player.class);

        player.getWorkoutSchedules();

        context.close();
    }
}
