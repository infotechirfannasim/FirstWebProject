package com.learning.fp;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        Student std1 = new Student(1, "irfan");
        Student std2 = new Student(2, "makki");
        Student std3 = new Student(3, "dasho");
        Student std4 = new Student(4, "akka");
        Student std5 = new Student(5, "asad");

        students.add(std1);
        students.add(std2);
        students.add(std3);
        students.add(std4);
        students.add(std5);

        return students;
    }

    public Student getSingleStudent() {
        return new Student(1, "irfan");
    }

    public Student getStudentById(long id) {
        List<Student> students = getAllStudents();
        Student student = null;

        for (Student std : students) {
            if (std.getId() == id) {
                student = std;
                break;
            }
        }
        return student;
    }

}
