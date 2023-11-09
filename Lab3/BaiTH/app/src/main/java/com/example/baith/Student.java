package com.example.baith;

public class Student {
    private int id;
    private String name;
    private int age;
    private int detdang;
    private float score;

    public Student(int id, String name, int age, int detdang, float score ) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.detdang = detdang;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getScore() {
        return score;
    }

    public int getNumber() {
        return detdang;
    }
}
