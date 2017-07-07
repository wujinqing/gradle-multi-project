package com.jin.service;

import com.jin.common.Student;
import com.jin.util.Assert;

/**
 * @author wu.jinqing
 * @date 2017年07月06日
 */
public class StudentService {
    public Student getStudentByName(String name)
    {
        if(!Assert.notEmpty(name))
            throw new NullPointerException();

        Student student = new Student();

        student.setName(name);
        student.setAge(20);

        return student;
    }
}
