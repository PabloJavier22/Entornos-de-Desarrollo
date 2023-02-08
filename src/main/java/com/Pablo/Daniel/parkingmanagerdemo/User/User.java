package com.Pablo.Daniel.parkingmanagerdemo.User;


public class User {    

    private int idUsu; 
    private String nombre;
    private String email;
    private String primerApellido;
    private String segundoApellido;


    public User(int idUsu,String nombre, String primerApellido, String segundoApellido, String email) {
        this.idUsu = idUsu;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.email = email;
    }

    public int getidUsu() {
      return idUsu;
    }
    public void setidUsu(int idUsu) {
       this.idUsu = idUsu;
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

