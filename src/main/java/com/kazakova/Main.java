package com.kazakova;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Collections.*;

/**
 * Created by sbt-kazakova-nv on 28.03.2017.
 */
public class Main {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<String>();
        System.out.println(stringList);

       Collections.sort(persons, new Comparator<Person>() {

           public int compare (Person o1, Person o2)
       }

    }
}
