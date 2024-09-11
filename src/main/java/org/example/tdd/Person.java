package org.example.tdd;

public class Person {
    private int age;
    public static final int MINIM_AGE = 10;
    public static final int MAXIM_AGE = 20;

    public Person(int age) {
        this.age = age;
    }

    public Boolean isTeenager() {
        return age > MINIM_AGE && age < MAXIM_AGE;
    }
}
