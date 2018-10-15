package com.example.student.recyclerview.model;

public class Student {
    private String name;
    private String eduBackground;

    public Student() {
    }

    public Student(String name, String eduBackground) {
        this.name = name;
        this.eduBackground = eduBackground;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEduBackground() {
        return eduBackground;
    }

    public void setEduBackground(String eduBackground) {
        this.eduBackground = eduBackground;
    }
}
