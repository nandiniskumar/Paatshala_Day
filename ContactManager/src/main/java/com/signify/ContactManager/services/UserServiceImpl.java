package com.signify.ContactManager.services;

import com.signify.ContactManager.entity.UserClass;
import com.signify.ContactManager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Override
    public UserClass saveUser(UserClass user) {
        return userRepository.save(user);
    }

    @Override
    public UserClass getUserById(Long userId) {
       return userRepository.findById(userId).get();
    }

    @Override
    public UserClass updateUser(Long userId, UserClass user) {
        UserClass deptDB = userRepository.findById(userId).get();
        if(Objects.nonNull(user.getName())&&!"".equalsIgnoreCase(user.getName())){
            deptDB.setName(user.getName());
        }

        if(Objects.nonNull(user.getPhoneNumber())&&!"".equalsIgnoreCase(user.getPhoneNumber())){
            deptDB.setPhoneNumber(user.getPhoneNumber());
        }

        if(Objects.nonNull(user.getEmail())&&!"".equalsIgnoreCase(user.getEmail())){
            deptDB.setEmail(user.getEmail());

        }
        return userRepository.save(deptDB);
    }

    @Override
    public void deleteUserById(Long userId) {
        userRepository.deleteById(userId);
    }
}
