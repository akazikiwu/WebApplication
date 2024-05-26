package com.fourteen.wms.Entity;

import lombok.Data;
@Data
public class User {
    private int id;
    private String account;
    private String name;
    private String password;
    private int age;
    private int sex;
    private String phone;
    private int level;
    private String isValid;
}
