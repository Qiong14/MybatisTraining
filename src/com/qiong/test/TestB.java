package com.qiong.test;

import com.qiong.mapper.FlowerMapper;
import com.qiong.mapper.FlowerMapper2;
import com.qiong.pojo.Flower;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestB {
    public static void main(String[] args) throws IOException {

        /*1. 解析扫描mybatis.xml文件*/
        InputStream stream = Resources.getResourceAsStream("mybatis.xml");

        /*2. 获得sqlsession工厂对象*/
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(stream);

        /*3. 获得sqlsession对象*/
        SqlSession sqlSession = factory.openSession();

        /*4. 执行sql语句的指定方法*/
        FlowerMapper2 flowerMapper = sqlSession.getMapper(FlowerMapper2.class);

        Flower f = new Flower(1, "chen", "m", "2020-01-01", "first", "XXXgmail.com");
        flowerMapper.insert(f);
        sqlSession.commit();


        /*5. 关闭资源*/
        sqlSession.close();
    }
}
