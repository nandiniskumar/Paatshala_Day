package com.signify.ContactManager.repository;

import com.signify.ContactManager.controller.UserController;
import com.signify.ContactManager.entity.UserClass;
import com.signify.ContactManager.services.UserService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserClass,Long> {
}
