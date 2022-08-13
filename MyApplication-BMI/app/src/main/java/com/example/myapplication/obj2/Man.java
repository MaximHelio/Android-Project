package com.example.myapplication.obj2;

import com.example.myapplication.obj.Person;
// 상속; Man의 bmi도 Person의 bmi도 double
public class Man extends Person {
    public Man(){
        height = 11;
        weight = 22;
        // 함수 부를 땐 파라미터 자료형 안씀, 함수 만들 땐 씀
        bmi = bmi(height, weight);
    }

    // Person의 bmi를 쓸 것인가, 나름대로 수정할 건지
    @Override
    public double bmi(int height, int weight) {
        // super: 부모 = Person
        return 1;
    }
}
