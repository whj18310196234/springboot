package com.example.springbootbuild.cn.com.item.dao;

import com.example.springbootbuild.cn.com.item.entity.PersonEntity;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface PersonEntityDao {

    List<PersonEntity> getPersonInfo(HashMap map);

}
