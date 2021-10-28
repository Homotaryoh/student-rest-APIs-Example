package com.example.studentrestAPIsExample.service;

import com.example.studentrestAPIsExample.model.Student;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {

    // Todo: Hard coded this for testing will remove once connected to database
    List<Student> studentList = Arrays.asList(new Student("Adefalaje", "Male",28),
            new Student("Tega","Male",30),
            new Student("Kunle", "Male",30),
            new Student("Tayo", "Male",30),
            new Student("Kayfash", "Male",30),
            new Student("Kemi", "female",28),
            new Student("Tosin", "Female",26),
            new Student("Tofunmi", "Female",25));
    public List<Student> getMales() {
        List<Student> males = studentList.stream()
                .filter(student -> student.getGender().equalsIgnoreCase("Male"))
                .collect(Collectors.toList());
        return males;
    }

    public List<Student> getFemales() {
        List<Student> females = studentList.stream()
                .filter(student -> student.getGender().equalsIgnoreCase("Female"))
                .collect(Collectors.toList());
        return females;
    }



}


