package com.qiong.mapper;

import com.qiong.pojo.Student;

public interface StudentMapper2 {

    int insert(Student student);

    int updateName(Student student);

    int delete(int sno);



}
