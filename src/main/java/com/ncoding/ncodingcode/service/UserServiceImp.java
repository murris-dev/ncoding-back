package com.ncoding.ncodingcode.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncoding.ncodingcode.model.User;
import com.ncoding.ncodingcode.repository.UserRepository;

@Service
public class UserServiceImp implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public ArrayList<User> getAllUser() {
        return (ArrayList<User>) userRepository.findAll();
    }

    @Override
    public Optional<User> getUserById(long id) {
        return userRepository.findById(id);
    }

    @Override
    public User saveUser(User u) {
        return userRepository.save(u);
    }

    @Override
    public boolean deleteUserById(long id) {
        try {
            Optional<User> u = getUserById(id);
            userRepository.delete(u.get());
            return true;
        }catch(Exception e) {
            return false;
        }
    }
    
}
