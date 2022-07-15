package com.qiong.test;

import com.qiong.mapper.StudentMapper2;
import com.qiong.pojo.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class TestB {
    public static void main(String[] args) throws IOException {

        /*1. 解析扫描mybatis.xml文件*/
        InputStream stream = Resources.getResourceAsStream("mybatis.xml");

        /*2. 获得sqlsession工厂对象*/
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(stream);

        /*3. 获得sqlsession对象*/
        SqlSession sqlSession = factory.openSession();

        /*4. 执行sql语句的指定方法*/
        StudentMapper2 studentMapper = sqlSession.getMapper(StudentMapper2.class);

        Student s = new Student(1, "chen", "m", "2020-01-01", "first", "XXXgmail.com");
        studentMapper.insert(s);
        sqlSession.commit();


        /*5. 关闭资源*/
        sqlSession.close();
    }
}
