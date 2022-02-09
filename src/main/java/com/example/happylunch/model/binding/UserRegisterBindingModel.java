package com.example.happylunch.model.binding;

import com.example.happylunch.model.enums.RoleNameEnum;
import com.example.happylunch.model.validator.UniqueUserName;
import org.springframework.format.annotation.NumberFormat;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class UserRegisterBindingModel {

    @NotBlank
    @Size(min=4, max=20)
    private String fullName;

    @NotBlank
    @Size(min=4, max=20)
    @UniqueUserName
    private String username;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    @Pattern(regexp="^\\d{10}$", message = "Please use digits only")
    @Size(min = 10, max = 10)
    private String phoneNumber;

    private RoleNameEnum role;

    @NotBlank
    @Size(min=4, max=20)
    private String password;

    @NotBlank
    @Size(min=4, max=20)
    private String confirmPassword;

    public UserRegisterBindingModel() {
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {

        this.fullName = fullName;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public RoleNameEnum getRole() {
        return role;
    }

    public UserRegisterBindingModel setRole(RoleNameEnum role) {
        this.role = role;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
