package com.Pablo.Daniel.parkingmanagerdemo.User;
import java.util.ArrayList;
import java.util.List;

public class UserRepository{

private ArrayList<User> usuarios;
public UserRepository() {
    usuarios = new ArrayList<>();
}
public List<User> getALL(){
    this.usuarios.clear();
    this.usuarios.add(new User("pmungar408@g.educaand.es","Pablo Javier Muñoz García"));
    return this.usuarios;
    }
}