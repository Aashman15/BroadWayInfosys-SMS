package com.test.service;

import java.util.List;

import com.test.model.Student;

public interface Studentdao {
        boolean addStudent(Student s);
        boolean deleteStudent(int id);
        boolean updateStudent(Student s);
        Student getById(int id);
        List<Student> getAllStudent();
        List<Student> searchStudent(String input);
}
