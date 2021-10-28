package com.example.studentrestAPIsExample.controller;

import com.example.studentrestAPIsExample.model.Student;
import com.example.studentrestAPIsExample.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/yoh")
    public String hello(){
        return "Hello TY, I know you love football";
    }

    @RequestMapping("/club")
    public String ManchesterUnited() {
        return "CR7";
    }
    @RequestMapping("/males")
    public List<Student> getMalesList(){
        return studentService.getMales();
    }
    @RequestMapping("/females")
    public List<Student> getFemalesList(){
        return studentService.getFemales();
    }
}
