package com.github.perscholas.dao;

import com.github.perscholas.model.CourseInterface;
import com.github.perscholas.model.StudentInterface;

import java.util.List;


public interface StudentDao {
    
    List<StudentInterface> getAllStudents();

    
    StudentInterface getStudentByEmail(String studentEmail);

    
    Boolean validateStudent(String studentEmail, String password);

    
    void registerStudentToCourse(String studentEmail, Integer courseId);

    
    List<CourseInterface> getStudentCourses(String studentEmail);
}
