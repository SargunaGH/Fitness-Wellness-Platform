package com.fitness.platform;

import java.util.HashMap;
import java.util.Map;

public class FitnessPlatform {
    private Map<String, Member> members;
    private Workout[] workouts;
    private WellnessTip[] wellnessTips;

    public FitnessPlatform() {
        members = new HashMap<>();
        workouts = new Workout[]{
            new Workout("Yoga", "A relaxing workout focusing on breathing and stretching.", 60),
            new Workout("HIIT", "High Intensity Interval Training for burning fat.", 30),
            new Workout("Strength Training", "Workout to build muscle strength.", 45)
        };

        wellnessTips = new WellnessTip[]{
            new WellnessTip("Hydration", "Drink at least 8 glasses of water daily."),
            new WellnessTip("Sleep", "Aim for 7-8 hours of sleep each night."),
            new WellnessTip("Mindfulness", "Practice mindfulness to reduce stress.")
        };
    }

    // Register new member
    public void registerMember(String memberId, String name, int age, String gender) {
        if (!members.containsKey(memberId)) {
            Member newMember = new Member(memberId, name, age, gender);
            members.put(memberId, newMember);
            System.out.println("Member registered successfully!");
        } else {
            System.out.println("Member ID already exists.");
        }
    }

    // View all workouts
    public void viewWorkouts() {
        System.out.println("\nWorkouts:");
        for (Workout workout : workouts) {
            System.out.println(workout);
        }
    }

    // View all wellness tips
    public void viewWellnessTips() {
        System.out.println("\nWellness Tips:");
        for (WellnessTip tip : wellnessTips) {
            System.out.println(tip);
        }
    }

    // Track workout progress for a member
    public void trackProgress(String memberId, String progress) {
        Member member = members.get(memberId);
        if (member != null) {
            member.addProgress(progress);
            System.out.println("Progress updated successfully.");
        } else {
            System.out.println("Member not found.");
        }
    }

    // View progress history of a member
    public void viewProgressHistory(String memberId) {
        Member member = members.get(memberId);
        if (member != null) {
            System.out.println("\nProgress History for " + member.getName() + ":");
            for (String progress : member.getProgressHistory()) {
                System.out.println(progress);
            }
        } else {
            System.out.println("Member not found.");
        }
    }
}
