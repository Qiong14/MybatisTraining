package com.qiong.test;

import com.qiong.mapper.StudentMapper3;
import com.qiong.pojo.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestC {
    public static void main(String[] args) throws IOException {

        /*1. 解析扫描mybatis.xml文件*/
        InputStream stream = Resources.getResourceAsStream("mybatis.xml");

        /*2. 获得sqlsession工厂对象*/
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(stream);

        /*3. 获得sqlsession对象*/
        SqlSession sqlSession = factory.openSession();

        /*4. 执行sql语句的指定方法*/
        StudentMapper3 studentMapper = sqlSession.getMapper(StudentMapper3.class);

        List<Student> list = studentMapper.selectMore("123","");

        sqlSession.commit();


        /*5. 关闭资源*/
        sqlSession.close();
    }
}