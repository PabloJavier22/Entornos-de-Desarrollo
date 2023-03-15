package com.Pablo.Daniel.parkingmanagerdemo;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.Pablo.Daniel.parkingmanagerdemo.user.domain.User;
import com.Pablo.Daniel.parkingmanagerdemo.user.domain.UserRepository;
import com.Pablo.Daniel.parkingmanagerdemo.user.service.UserService;
import com.Pablo.Daniel.parkingmanagerdemo.user.service.UserServiceImpl;

public class UserServiceTest {
  

  @Test
  void testReadAll(){
    List<User> userMockedList = new ArrayList<>();
    userMockedList.add(new User((long) 001,"Pablo Javier","Muñoz","García","pmungar@g.educaand.es"));
    userMockedList.add(new User((long) 002,"Daniel","Garcia","Mesa","dgarmes@g.educaand.es"));

    UserRepository mockedRepository = mock(UserRepository.class);

    when(mockedRepository.findAll()).thenReturn(userMockedList);
    UserService service = new UserServiceImpl(mockedRepository);

    //Act
    List<User> actualUsers = service.readAll();

    assertEquals(userMockedList, actualUsers);

  }
}
