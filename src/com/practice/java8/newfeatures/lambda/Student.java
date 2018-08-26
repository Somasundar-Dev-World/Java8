package com.practice.java8.newfeatures.lambda;

import java.util.Objects;

public class Student {

    private String name;

    private String grade;

    private String total;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name, String grade, String total) {
        this.name = name;
        this.grade = grade;
        this.total = total;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                ", total='" + total + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) &&
                Objects.equals(grade, student.grade) &&
                Objects.equals(total, student.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, grade, total);
    }
}
