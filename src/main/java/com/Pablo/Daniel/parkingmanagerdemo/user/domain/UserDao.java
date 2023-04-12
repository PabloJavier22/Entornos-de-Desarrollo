package com.Pablo.Daniel.parkingmanagerdemo.user.domain;

/**
 * Clase userDao para los datos del usuario
 * @author Daniel García Mesa
 * @author Pablo Javier Muñoz García
 * @version 1.0
 * @since 12.04.2023
 */

public class UserDao {

    private String nombre;
    private String email;
    private String primerApellido;
    private String segundoApellido;

    /**
     * Constructor vacio
     */
    public UserDao() {
        this("", "", "", "");
    }

    /**
     * Constructor de userdao
     * 
     * @param nombre
     * @param email
     * @param primerApellido
     * @param segundoApellido
     */
    public UserDao(String nombre, String email, String primerApellido, String segundoApellido) {
        this.nombre = nombre;
        this.email = email;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
    }

    /**
     * getter de nombre para userdao
     * 
     * @return devuelve el nombre de userdao
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * setter de nombre para userdao
     * 
     * @param nombre valor que cambia nombre de userdao
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * getter de email para userdao
     * 
     * @return devuelve el email de userdao
     */
    public String getEmail() {
        return email;
    }

    /**
     * setter de email para userdao
     * 
     * @param email valor que cambia email de userdao
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * getter de primer apellido para userdao
     * 
     * @return devuelve el primer apellido de userdao
     */
    public String getPrimerApellido() {
        return primerApellido;
    }

    /**
     * setter de primer apellido para userdao
     * 
     * @param primerApellido valor que cambia el primer apellido de userdao
     */
    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    /**
     * getter de segundo apellido para userdao
     * 
     * @return devuelve el segundo apellido de userdao
     */
    public String getSegundoApellido() {
        return segundoApellido;
    }

    /**
     * setter de segundo apellido de userdao
     * 
     * @param segundoApellido valor que cambia el segundo apellido de userdao
     */
    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }
}
