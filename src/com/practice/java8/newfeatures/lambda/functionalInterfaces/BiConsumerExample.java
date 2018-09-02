/*
 * Copyright (c) 2018. All Rights reserved.
 */

package com.practice.java8.newfeatures.lambda.functionalInterfaces;

import com.practice.java8.newfeatures.lambda.data.Student;
import com.practice.java8.newfeatures.lambda.data.StudentsDatabase;

import java.util.List;
import java.util.function.BiConsumer;

/**
 *
 */
public class BiConsumerExample {

    static BiConsumer<String, Student> appendToStudentName = (appendStr, student) -> {
        student.setName(appendStr+ ". "+student.getName());
        System.out.println(student);
    };

    static BiConsumer<Integer, Student> filterByGradeLevel = (gradeLevel, student) -> {
        if (student.getGradeLevel() == gradeLevel) {
            System.out.println(student);
        }
    };

    public static void main(String[] args) {

        printAppendedStudentNames();
        printFilterByGradeLevel();
    }

    private static void printAppendedStudentNames() {
        System.out.println(" Method name : printAppendedStudentNames");
        List<Student> allStudents = StudentsDatabase.getAllStudents();
        allStudents.forEach((student) -> {
            appendToStudentName.accept("Mr",student);
        });
    }

    private static void printFilterByGradeLevel() {
        System.out.println(" Method name : printFilterByGradeLevel");
        List<Student> allStudents = StudentsDatabase.getAllStudents();
        allStudents.forEach((student) -> {
            filterByGradeLevel.accept(2, student);
        });
    }
}
