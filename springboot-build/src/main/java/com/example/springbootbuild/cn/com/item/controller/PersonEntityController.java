package com.example.springbootbuild.cn.com.item.controller;

import com.example.springbootbuild.cn.com.item.entity.PersonEntity;
import com.example.springbootbuild.cn.com.item.service.PersonEntityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/person")
public class PersonEntityController {

    @Autowired
    private PersonEntityService personEntityService;

    @RequestMapping
    public Object getPersonInfo(){
        return personEntityService.getPersonInfo(null);
    }


}
