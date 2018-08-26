package com.practice.java8.newfeatures.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImperitiveVsDeclarativeExample2 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,5,6,6,7,8,9,9,10);

        List<Integer> uniqueList = new ArrayList<>();
        for (Integer num : list ) {
            if (!uniqueList.contains(num)) {
                uniqueList.add(num);
            }
        }
        System.out.println(uniqueList);

        List<Integer> collect = list.stream().distinct().collect(Collectors.toList());
        System.out.println(collect);

        List<String> namesList = Arrays.asList("Soma","Soma","Rekha","Raj");
        List<String> collect1 = namesList.stream().distinct().collect(Collectors.toList());
        System.out.println(collect1);

        List<Student> studentList = new ArrayList<>();
        Student student1 = new Student("ramesh", "A", "500");
        Student student2 = new Student("Prakash", "B","400");
        Student student3 = new Student(" Kishore", "C","350");
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        System.out.println(studentList);

        List<Student> collect2 = studentList.stream().distinct().collect(Collectors.toList());
        System.out.println(collect2);

        final List<Student> a = studentList.stream().filter(student -> {
            return student.getGrade().equals("A");
        }).collect(Collectors.toList());
        System.out.println(a);

    }

}
