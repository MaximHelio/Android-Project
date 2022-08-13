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

    // 패키지가 다른 클래스 안에서 상속받지 않는 이상 person. 찍었을 때 안나옴
    // ex. MainActivity에서 안나옴
    private String etc;
}
