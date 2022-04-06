package com.example.springbootbuild.cn.com.item.service;

import com.example.springbootbuild.cn.com.item.entity.PersonEntity;

import java.util.HashMap;
import java.util.List;

public interface PersonEntityService {

    List<PersonEntity> getPersonInfo(HashMap map);

}
