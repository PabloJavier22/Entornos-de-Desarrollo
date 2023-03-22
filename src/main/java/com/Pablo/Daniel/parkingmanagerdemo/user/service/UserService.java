package com.Pablo.Daniel.parkingmanagerdemo.user.service;

import java.util.List;

import com.Pablo.Daniel.parkingmanagerdemo.user.domain.*;

public interface UserService {
  
  public List<User> readAll();

  public void register(UserDao userDao);
}
