package com.qiong.mapper;

import com.qiong.pojo.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {

    /*查询所有*/
    List<Student> selectAll();

    Student selectOne(int sno);

    Student selectMore(int sno, String name);

    Student selectMore2(@Param("sno") int sno, @Param("name") String name);

    Student selectMore3(Student student);

    Student selectMore4(Student student, Student student2);

}
