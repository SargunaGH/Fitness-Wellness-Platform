package com.fitness.platform;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private String memberId;
    private String name;
    private int age;
    private String gender;
    private List<String> progressHistory;

    public Member(String memberId, String name, int age, String gender) {
        this.memberId = memberId;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.progressHistory = new ArrayList<>();
    }

    public String getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public List<String> getProgressHistory() {
        return progressHistory;
    }

    public void addProgress(String progress) {
        progressHistory.add(progress);
    }

    @Override
    public String toString() {
        return "Member ID: " + memberId + ", Name: " + name + ", Age: " + age + ", Gender: " + gender;
    }
}
