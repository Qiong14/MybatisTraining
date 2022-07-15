package com.qiong.mapper;

import com.qiong.pojo.Flower;

import java.util.List;

public interface FlowerMapper3 {
    List<Flower> selectMore(String name, String sex);

    List<Flower> selectMore2(String name, String sex);

    List<Flower> selectMore3(String name, String sex);

}
