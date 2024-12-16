package com.donkey.mybatisPlus.service.impl;

import com.donkey.mybatisPlus.entity.Student;
import com.donkey.mybatisPlus.mapper.StudentMapper;
import com.donkey.mybatisPlus.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;


    @Override
    public void getStudent() {
        List<Student> student = studentMapper.getStudent();
        System.out.println(student);
    }
}
