package com.donkey.mybatisPlus.controller;


import com.donkey.mybatisPlus.service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Resource
    private StudentService studentService;

    @PostMapping("/getStudent")
    public void getStudent() {
        studentService.getStudent();
    }

}
