package com.example.springbootbuild.cn.com.item.service.impl;

import com.example.springbootbuild.cn.com.item.dao.PersonEntityDao;
import com.example.springbootbuild.cn.com.item.entity.PersonEntity;
import com.example.springbootbuild.cn.com.item.service.PersonEntityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Slf4j
@Service("personEntityService")
public class PersonEntityServiceImpl implements PersonEntityService {

    @Autowired
    private PersonEntityDao personEntityDao;

    @Override
    public List<PersonEntity> getPersonInfo(HashMap map) {
        return personEntityDao.getPersonInfo(null);
    }
}
