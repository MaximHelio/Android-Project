package com.example.myapplication.obj;

public class Person {
    public int height, weight;
    public String name;
    public double bmi; // bmi라는 변수

    // bmi라는 함수
    public double bmi(int height, int weight) {
        double result = height - weight * 0.9;
        System.out.println("BMI:" + result);
        return result;
    }
}
