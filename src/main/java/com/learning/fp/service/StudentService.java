package com.learning.fp.service;

import com.learning.fp.entity.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    public static List<Student> students = new ArrayList<>();

    public List<Student> getAllStudents() {
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

    public Student createStudent(Student student) {
        students.add(student);
        return student;
    }

    public Student updateStudent(Student student) {
        Student stdFound = null;
        for (Student std : students) {
            if (std.getId() == student.getId()) {
                stdFound = std;
                break;
            }
        }
        if (stdFound != null) {
            stdFound.setId(student.getId());
            stdFound.setName(student.getName());
        }
        return stdFound;
    }
}
