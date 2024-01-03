package com.library.college.dto;

public class Student {

    private String name;
    private int age;
    private int classOfStudent;
    private int section;

    public Student() {
    }

    public Student(String name, int age, int classOfStudent, int section) {
        this.name = name;
        this.age = age;
        this.classOfStudent = classOfStudent;
        this.section = section;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getClassOfStudent() {
        return classOfStudent;
    }

    public void setClassOfStudent(int classOfStudent) {
        this.classOfStudent = classOfStudent;
    }

    public int getSection() {
        return section;
    }

    public void setSection(int section) {
        this.section = section;
    }
}
