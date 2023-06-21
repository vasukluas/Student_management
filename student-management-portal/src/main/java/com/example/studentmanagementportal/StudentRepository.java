package com.example.studentmanagementportal;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
@Repository
public class StudentRepository {
    Map<Integer,Student> studentsDb=new HashMap<>();

    public Student getStudent(int admno) {
        return studentsDb.get(admno);
    }

    public String addStudent(Student student) {
        if(studentsDb.containsKey(student.getAdmno())){
            return "student already present";
        }
        studentsDb.put(student.getAdmno(),student);
        return "student added successfully";
    }

    public Student getByPathvariable(int admno) {
       return studentsDb.get(admno);
    }

    public String deleteStudent(int admno) {
        studentsDb.remove(admno);
        return "Student Successfully deleted";
    }

    public Student updateStudentcourse(int admno, String newCourse) {
       if(!studentsDb.containsKey(admno)){
           throw new RuntimeException("Student doesn't exist");
        }
        Student student=studentsDb.get(admno);
       student.setCourse(newCourse);
       return student;
//        if(!studentsDb.containsKey(admno)){
//            throw new RuntimeException("Student Doesn't Exist");
//        }
//        Student student=studentsDb.get(admno);
//        student.setCourse(newCourse);
//        return student;

    }

    public int getTotalStudents() {
        int total=0;
        for(int admno: studentsDb.keySet()){
            if(studentsDb.get(admno).getAge()<25){
                total++;
            }
        }
        return total;
    }
}
