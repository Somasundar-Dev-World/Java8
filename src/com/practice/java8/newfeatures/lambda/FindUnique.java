/*
 * Copyright (c) 2018. All Rights reserved.
 */

package com.practice.java8.newfeatures.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindUnique {

    public static void main(String[] args) {

        FindUnique unique = new FindUnique();
        final List<Student> studentList = unique.mockStudentsList();
        System.out.println("Size : "+studentList.size()+" "+studentList);
        List<Student> uniqueStudents = unique.getUniqueStudents(studentList);
        System.out.println("Size : "+uniqueStudents.size()+" "+uniqueStudents);
        List<Student> filteredList = unique.removeFromList(studentList, new Student("Rajesh","A", "488"));
        System.out.println("Size : "+filteredList.size()+" "+filteredList);


    }

    private List<Student> mockStudentsList() {
        List<Student> studentList = new ArrayList<>();
        Student student1 = new Student("Somasundar", "A", "499");
        Student student2 = new Student("Rajesh", "A", "488");
        Student student3 = new Student("Rekha", "A", "499");
        Student student4 = new Student("Rajesh", "B", "499");
        Student student5 = new Student("Somasundar", "A", "499");
        Student student6 = new Student("Rekha", "A", "499");
        Student student7 = new Student("Rajesh", "A", "488");

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);
        studentList.add(student7);

        return studentList;
    }

    private List<Student> getUniqueStudents(List<Student> studentList) {

        List<Student> uniqueStudents = studentList.stream().distinct().collect(Collectors.toList());
        return  uniqueStudents;
    }

    private List<Student> removeFromList(List<Student> studentList, Student removableStudent) {
        List<Student> filteredList = studentList.stream().filter(student -> !student.equals(removableStudent)).collect(Collectors.toList());
        return filteredList;
    }
}
