/*
 * Copyright (c) 2018. All Rights reserved.
 */

package com.practice.java8.newfeatures.lambda.data;

import java.util.List;
import java.util.Objects;

public class Student {

    private String name;
    private int gradeLevel;
    private double gpa;
    private String gender;
    private int noteBooks;
    private List<String> activities;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getNoteBooks() {
        return noteBooks;
    }

    public void setNoteBooks(int noteBooks) {
        this.noteBooks = noteBooks;
    }

    public List<String> getActivities() {
        return activities;
    }

    public void setActivities(List<String> activities) {
        this.activities = activities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return gradeLevel == student.gradeLevel &&
                Double.compare(student.gpa, gpa) == 0 &&
                noteBooks == student.noteBooks &&
                Objects.equals(name, student.name) &&
                Objects.equals(gender, student.gender) &&
                Objects.equals(activities, student.activities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gradeLevel, gpa, gender, noteBooks, activities);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gradeLevel=" + gradeLevel +
                ", gpa=" + gpa +
                ", gender='" + gender + '\'' +
                ", noteBooks=" + noteBooks +
                ", activities=" + activities +
                '}';
    }

    public Student(String name, int gradeLevel, double gpa, String gender, int noteBooks, List<String> activities) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
        this.gender = gender;
        this.noteBooks = noteBooks;
        this.activities = activities;
    }

}
