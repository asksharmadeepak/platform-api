package com.example.demo.controllers;

import com.example.demo.domains.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dsm2061 on 11/27/18.
 */
@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User create(User user) {
        return userRepository.save(user);
    }

    public User delete(long id) {
        User user = findById(id);
        if(user != null){
            userRepository.deleteById(id);
        }
        return user;
    }


    public User findById(Long id) {
        return userRepository.findById(id).get();
    }


    public List<User> findAll() {
        List<User> all = userRepository.findAll();
        return all;
    }

    public User update(User user) {
        return userRepository.save(user);
    }
}