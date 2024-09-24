package com.fitness.platform;

public class Workout {
    private String workoutName;
    private String description;
    private int duration;  // in minutes

    public Workout(String workoutName, String description, int duration) {
        this.workoutName = workoutName;
        this.description = description;
        this.duration = duration;
    }

    public String getWorkoutName() {
        return workoutName;
    }

    public String getDescription() {
        return description;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Workout: " + workoutName + ", Duration: " + duration + " minutes, Description: " + description;
    }
}
