package com.Pablo.Daniel.parkingmanagerdemo.user.domain;

public class UserDao{

    private String nombre;
    private String email;
    private String primerApellido;
    private String segundoApellido;


    public UserDao(){
        this("","","","");
    }
    public UserDao(String nombre, String email, String primerApellido, String segundoApellido) {
        this.nombre = nombre;
        this.email = email;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }
}
