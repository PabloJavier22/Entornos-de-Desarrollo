package com.Pablo.Daniel.parkingmanagerdemo.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Pablo.Daniel.parkingmanagerdemo.user.domain.User;
import com.Pablo.Daniel.parkingmanagerdemo.user.domain.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;


    @Autowired
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public List<User> readAll(){
        return (List<User>)userRepository.findAll();
    }

}
