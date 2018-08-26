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
        print(uniqueList);

        List<Integer> collect = list.stream().distinct().collect(Collectors.toList());
        print(collect);

        List<String> namesList = Arrays.asList("Soma","Soma","Rekha","Raj");
        List<String> collect1 = namesList.stream().distinct().collect(Collectors.toList());
        print(collect1);

        List<Student> studentList = new ArrayList<>();
        Student student1 = new Student("ramesh", "A", "500");
        Student student2 = new Student("Prakash", "B","400");
        Student student3 = new Student(" Kishore", "C","350");
        Student student4 = new Student("Prakash", "B","400");
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        print(" Raw list : ",studentList);

        List<Student> collect2 = studentList.stream().distinct().collect(Collectors.toList());
        print(" Using distinct : ",collect2);

        final List<Student> a = studentList.stream().filter(student -> {
            return student.getGrade().equals("A");
        }).collect(Collectors.toList());
        print(" Filtered list : ", a);

    }

    public static void print(String label, Object value) {
        if(label!=null) {
            System.out.println("============================================================================================");
            System.out.println("                                        " + label + "                                           ");
            System.out.println("============================================================================================");
        }
        System.out.println(value);
        //System.out.println("============================================================================================");
    }

    public static void print(Object value) {
        System.out.println(value);
    }
}
