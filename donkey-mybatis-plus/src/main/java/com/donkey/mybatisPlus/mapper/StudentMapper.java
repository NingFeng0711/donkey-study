package com.donkey.mybatisPlus.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.donkey.mybatisPlus.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper extends BaseMapper<Student> {

    List<Student> getStudent();

}
