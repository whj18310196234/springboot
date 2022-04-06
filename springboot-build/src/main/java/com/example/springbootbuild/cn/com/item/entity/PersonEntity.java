package com.example.springbootbuild.cn.com.item.entity;

import jnr.ffi.annotations.In;
import lombok.Data;

@Data
public class PersonEntity {

    private Integer id;
    private String name;
    private Integer age;
    private String addr;
    private String tel;

    public PersonEntity() {
    }

    public PersonEntity(Integer id, String name, Integer age, String addr, String tel) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.addr = addr;
        this.tel = tel;
    }
}
