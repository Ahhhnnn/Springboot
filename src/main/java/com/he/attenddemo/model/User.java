package com.he.attenddemo.model;

import lombok.Data;

@Data
public class User {
    private String id;
    private String username;
    private String password;
    private int age;
    private String address;
}
