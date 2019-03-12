package com.soft1841.book.entity;

import cn.hutool.db.Db;
import cn.hutool.db.Entity;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;

/**
 * 读者实体类
 */
public class Reader extends java.io.Reader {
    private Long id;
    private String name;
    private  String role;
    private  String avatar;
    private  String department;
    private  String email;
    private String mobile;
    private Date joinDate;

    public Long getId () {
        return id;
    }

    public void setId (Long id) {
        this.id = id;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getRole () {
        return role;
    }

    public void setRole (String role) {
        this.role = role;
    }

    public String getAvatar () {
        return avatar;
    }

    public void setAvatar (String avatar) {
        this.avatar = avatar;
    }

    public String getDepartment () {
        return department;
    }

    public void setDepartment (String department) {
        this.department = department;
    }

    public String getEmail () {
        return email;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    public String getMobile () {
        return mobile;
    }

    public void setMobile (String mobile) {
        this.mobile = mobile;
    }

    public Date getJoinDate () {
        return joinDate;
    }

    public void setJoinDate (Date joinDate) {
        this.joinDate = joinDate;
    }


    @Override
    public int read(char[] cbuf, int off, int len) throws IOException {
        return 0;
    }

    @Override
    public void close() throws IOException {

    }
}


