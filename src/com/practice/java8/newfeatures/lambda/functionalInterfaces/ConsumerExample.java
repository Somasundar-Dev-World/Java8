/*
 * Copyright (c) 2018. All Rights reserved.
 */

package com.practice.java8.newfeatures.lambda.functionalInterfaces;

import com.practice.java8.newfeatures.lambda.data.Student;
import com.practice.java8.newfeatures.lambda.data.StudentsDatabase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    private static Consumer<Student> printStudentName = (student) -> {
        System.out.println(student);
    };

    private static Consumer<Student> printStudentNameInUpperCase = (student) -> {
        System.out.print(student.getName().toUpperCase());
    };

    private static Consumer<Student> printStudentNameActivities = (student) -> {
            System.out.println(student.getActivities());
    };


    public static void main(String[] args) {

        Consumer<String> c2 = (name)-> {
            System.out.println(name);
        };

        Consumer<String> c1 = (name) -> {
            System.out.println("Converted name : "+name.toUpperCase());
        };

        c1.accept("Soma");

        List<String> namesList = Arrays.asList("Soma", "Sundar", "Rajesh", "Kumar", "Prakash");

        namesList.forEach(c1);

        printNames();
        printNAmesInUpperCase();
        printNameAndActivitiesUsingCondition();
    }


    public static void printNames() {
        System.out.println(" Print Names methods :");
        List<Student> allStudents = StudentsDatabase.getAllStudents();
        allStudents.forEach(printStudentName);
    }

    public static void printNAmesInUpperCase() {
        System.out.println(" Print Names In Uppercase :");
        List<Student> allStudents = StudentsDatabase.getAllStudents();
        allStudents.forEach((student)->{
            printStudentNameInUpperCase.andThen(printStudentNameActivities).accept(student);
        });
    }

    public static void printNameAndActivitiesUsingCondition() {
        System.out.println(" Print Names In Condition :");
        List<Student> allStudents = StudentsDatabase.getAllStudents();
        allStudents.forEach((student)->{
            if(student.getGradeLevel() > 2 && student.getGpa() > 3.5) {
                printStudentName.accept(student);
            }
        });

    }
}
