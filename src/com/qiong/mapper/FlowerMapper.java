package com.qiong.mapper;

import com.qiong.pojo.Flower;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.concurrent.Flow;

public interface FlowerMapper {

    /*查询所有*/
    List<Flower> selectAll();

    Flower selectOne(int sno);

    Flower selectMore(int sno, String name);

    Flower selectMore2(@Param("sno") int sno, @Param("name") String name);

    Flower selectMore3(Flower flower);

    Flower selectMore4(Flower flower, Flower flower2);

}
