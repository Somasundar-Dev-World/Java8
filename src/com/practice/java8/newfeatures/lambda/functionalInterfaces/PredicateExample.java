/*
 * Copyright (c) 2018. All Rights reserved.
 */

package com.practice.java8.newfeatures.lambda.functionalInterfaces;

import com.practice.java8.newfeatures.lambda.data.Student;
import com.practice.java8.newfeatures.lambda.data.StudentsDatabase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    static Predicate<Student> passedStudents = (student) -> student.getGradeLevel() > 2 ;

    static Predicate<Student> genderFemaleStudents = (student) -> student.getGender().equalsIgnoreCase("female");

    public static void main(String[] args) {

        printPassedStudents();
        printonlyFemaleStudents();
        printonlyPassedFemaleStudents();
    }

    public static void printPassedStudents() {
        System.out.println(" Method name : printPassedStudents");
        List<Student> allStudents = StudentsDatabase.getAllStudents();
        allStudents.forEach(student -> {
            if (passedStudents.test(student)) {
                System.out.println(student);
            }
        });
    }

    public static void printonlyFemaleStudents() {
        System.out.println(" Method name : printonlyFemaleStudents");
        List<Student> allStudents = StudentsDatabase.getAllStudents();
        allStudents.forEach((student) -> {
            if (genderFemaleStudents.test(student)) {
                System.out.println(student);
            }
        });
    }

    public static void printonlyPassedFemaleStudents() {
        System.out.println(" Method name : printonlyPassedFemaleStudents");
        List<Student> allStudents = StudentsDatabase.getAllStudents();
        allStudents.forEach((student) -> {
           if (passedStudents.and(genderFemaleStudents).test(student)) {
               System.out.println(student);
           }
        });
    }

}
