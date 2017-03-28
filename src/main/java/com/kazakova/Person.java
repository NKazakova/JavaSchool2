package com.kazakova;

import java.util.Date;

/**
 * Created by sbt-kazakova-nv on 28.03.2017.
 */
public class Person {

    private String name;
    private Date birthDay;

    public Person(String name, Date birthDay) {
        this.name = name;
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthDay=" + birthDay +
                '}';
    }
}
