package com.Pablo.Daniel.parkingmanagerdemo.User;

public class User {
    private String nombre;
    private String email;
    public User(String email,String nombre){
        this.nombre = nombre;
        this.email = email;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getEmail(){
        return this.email;
    }
    public void SetNombre(String nombre){
        this.nombre = nombre;
    }
}

