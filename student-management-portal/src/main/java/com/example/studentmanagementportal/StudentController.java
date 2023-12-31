package com.example.studentmanagementportal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {

      @Autowired
      StudentService studentService;

    @GetMapping("/get_info")
    public ResponseEntity getStudent(@RequestParam("id") int admno){
    Student s= studentService.getStudent(admno);
    if(s==null){
     return new ResponseEntity("Student Not Found", HttpStatus.NOT_FOUND);
    }
    return new ResponseEntity(s,HttpStatus.ACCEPTED);
    }

    @PostMapping("/add")
    public ResponseEntity addStudent(@RequestBody Student student){
        String s= studentService.addStudent(student);
        return new ResponseEntity(s,HttpStatus.CREATED);
    }
    @GetMapping("/get/{id}/{message}")
    public ResponseEntity getByPathvariable(@PathVariable("id")int admno,@PathVariable("message")String message){
        String s= studentService.getByPathvariable(admno,message);
        return new ResponseEntity(s,HttpStatus.ACCEPTED);
    }
    @DeleteMapping("/delete")
    public ResponseEntity deleteStudent(@RequestParam("id")int admno){
        String s= studentService.deleteStudent(admno);
        return new ResponseEntity(s,HttpStatus.NO_CONTENT);
    }
    @PutMapping("/put")
    public ResponseEntity updateStudentcourse(@RequestParam("id")int admno,@RequestParam("course")String newCourse){
      Student s= studentService.updateStudentcourse(admno,newCourse);
        return new ResponseEntity(s,HttpStatus.OK);
    }
    @GetMapping("/getTotalStudents")
    public ResponseEntity getTotalStudents(){
   int n= studentService.getTotalStudents();
        return new ResponseEntity(n,HttpStatus.ACCEPTED);
    }
//    @GetMapping("/get/{id}/{message}")
//    public String getByPathvariable(@PathVariable("id")int admno,@PathVariable("message")String message){
//        return studentService.getByPathvariable(admno,message);
//    }
//    @DeleteMapping("/delete")
//    public String deleteStudent(@RequestParam("id")int admno){
//        return studentService.deleteStudent(admno);
//    }
//    @PutMapping("/put")
//    public Student updateStudentcourse(@RequestParam("id")int admno,@RequestParam("course")String newCourse){
//        return studentService.updateStudentcourse(admno,newCourse);
//    }
//    @GetMapping("/getTotalStudents")
//    public int getTotalStudents(){
//        return studentService.getTotalStudents();
//    }
}
