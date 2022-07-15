package com.qiong.mapper;

import com.qiong.pojo.Student;

import java.util.List;

public interface StudentMapper3 {
    List<Student> selectMore(String name, String sex);

    List<Student> selectMore2(String name, String sex);

    List<Student> selectMore3(String name, String sex);

}
