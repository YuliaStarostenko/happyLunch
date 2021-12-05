package com.example.happylunch.service;

import com.example.happylunch.model.service.UserRegisterServiceModel;

public interface UserService {

    void registerAndLoginUser(UserRegisterServiceModel userRegisterServiceModel);

    boolean isUserNameFree(String userName);

    void initializeUsersAndRoles();
}
