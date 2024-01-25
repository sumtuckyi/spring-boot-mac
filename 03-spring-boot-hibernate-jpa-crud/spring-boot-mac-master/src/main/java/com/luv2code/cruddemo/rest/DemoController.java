package com.luv2code.cruddemo.rest;

import com.luv2code.cruddemo.common.Coach;
import org.springframework.beans.factory.annotation.Qualifier;

public class DemoController {

    // define a private field for the dependency
    private Coach myCoach;


    public DemoController(@Qualifier("cricketCoach") Coach theCoach) {
            System.out.println("In constructor: " + getClass().getSimpleName());
            myCoach = theCoach;

    }

    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

}
