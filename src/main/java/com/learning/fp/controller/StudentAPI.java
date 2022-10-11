package com.learning.fp.controller;

import com.learning.fp.entity.Student;
import com.learning.fp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentAPI {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String getStudents() {
        return "all students";
    }

    @RequestMapping(value = "/get-all", method = RequestMethod.GET)
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @RequestMapping(value = "/get-single", method = RequestMethod.GET)
    public Student getSingleStudent() {
        return studentService.getSingleStudent();
    }

    @RequestMapping(value = "/get-by-id/", method = RequestMethod.GET)
    public Student getSingleStudent(@RequestParam(value = "stdId") long stdId) {

        return studentService.getStudentById(stdId);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Student createStudent(@RequestBody Student student) {

        return studentService.createStudent(student);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public Student updateStudent(@RequestBody Student student) {

        return studentService.updateStudent(student);
    }
}
