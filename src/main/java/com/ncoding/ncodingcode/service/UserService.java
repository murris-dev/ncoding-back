package com.ncoding.ncodingcode.service;
import java.util.ArrayList;
import java.util.Optional;

import com.ncoding.ncodingcode.model.User;

public interface UserService {
    
    ArrayList<User> getAllUser();
    Optional<User> getUserById(long id);
    User saveUser(User u);
    boolean deleteUserById(long id);
}
