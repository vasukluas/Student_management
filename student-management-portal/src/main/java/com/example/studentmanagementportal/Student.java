package com.example.studentmanagementportal;

public class Student {
    private int admno;
    private String name;
    private int age;
    private String course;

    public Student() {
    }

    public Student(int admno, String name, int age, String course) {
        this.admno = admno;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public int getAdmno() {
        return admno;
    }

    public void setAdmno(int admno) {
        this.admno = admno;
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

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "admno=" + admno +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", course='" + course + '\'' +
                '}';
    }
}
