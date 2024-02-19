package com.signify.ContactManager.services;

import com.signify.ContactManager.entity.UserClass;
import org.apache.catalina.User;

public interface UserService {
    UserClass saveUser(UserClass user);

    UserClass getUserById(Long userId);

    UserClass updateUser(Long userId, UserClass user);

    void deleteUserById(Long userId);
}
