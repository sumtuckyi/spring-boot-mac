package com.luv2code.cruddemo.common;

import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "?";
    }
}
