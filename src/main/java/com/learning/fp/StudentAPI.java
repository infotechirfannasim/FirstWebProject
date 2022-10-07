package com.learning.fp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
}
