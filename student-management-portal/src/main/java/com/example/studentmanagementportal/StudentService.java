package com.example.studentmanagementportal;

import org.springframework.beans.factory.annotation.Autowired;

public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public Student getStudent(int admno) {
        return studentRepository.getStudent(admno);
    }

    public String addStudent(Student student) {
        return studentRepository.addStudent(student);
    }

    public String getByPathvariable(int admno,String message) {
        Student s=studentRepository.getByPathvariable(admno);
        return s+message;
    }

    public String deleteStudent(int admno) {
        return studentRepository.deleteStudent(admno);
    }

    public Student updateStudentcourse(int admno, String newCourse) {
        return studentRepository.updateStudentcourse(admno,newCourse);
    }

    public int getTotalStudents() {
        return studentRepository.getTotalStudents();
    }
}
