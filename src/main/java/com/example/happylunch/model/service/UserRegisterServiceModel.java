package com.example.happylunch.model.service;

import com.example.happylunch.model.enums.RoleNameEnum;

public class UserRegisterServiceModel {

    private String fullName;
    private String username;
    private String email;
    private String phoneNumber;
    private RoleNameEnum role;
    private String password;

    public UserRegisterServiceModel() {
    }

    public String getFullName() {
        return fullName;
    }

    public UserRegisterServiceModel setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public UserRegisterServiceModel setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserRegisterServiceModel setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public UserRegisterServiceModel setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public RoleNameEnum getRole() {
        return role;
    }

    public UserRegisterServiceModel setRole(RoleNameEnum role) {
        this.role = role;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserRegisterServiceModel setPassword(String password) {
        this.password = password;
        return this;
    }
}
