package com.Pablo.Daniel.parkingmanagerdemo;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.Pablo.Daniel.parkingmanagerdemo.user.domain.Role;
import com.Pablo.Daniel.parkingmanagerdemo.user.domain.User;
import com.Pablo.Daniel.parkingmanagerdemo.user.domain.UserDao;
import com.Pablo.Daniel.parkingmanagerdemo.user.domain.UserRepository;
import com.Pablo.Daniel.parkingmanagerdemo.user.service.UserService;
import com.Pablo.Daniel.parkingmanagerdemo.user.service.UserServiceImpl;

public class UserServiceTest {
  

  @Test
  void testReadAll(){
    List<User> userMockedList = new ArrayList<>();
    userMockedList.add(new User((long) 001,"Pablo Javier","Muñoz","García","pmungar@g.educaand.es",Role.STUDENT));
    userMockedList.add(new User((long) 002,"Daniel","Garcia","Mesa","dgarmes@g.educaand.es",Role.STUDENT));

    UserRepository mockedRepository = mock(UserRepository.class);

    when(mockedRepository.findAll()).thenReturn(userMockedList);
    UserService service = new UserServiceImpl(mockedRepository);

    //Act
    List<User> actualUsers = service.readAll();

    assertEquals(userMockedList, actualUsers);

  }
  @Test
  void testRegistro(){

    UserRepository mockedRepository = mock(UserRepository.class);

    UserService service = new UserServiceImpl(mockedRepository);
    UserDao userDao = new UserDao("nombre","email", "apellido1","apellido2",Role.STUDENT);

    //service.register(userDao);

    verify(mockedRepository).save(any());

  }
}
