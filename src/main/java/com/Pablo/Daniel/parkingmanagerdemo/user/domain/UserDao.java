package com.Pablo.Daniel.parkingmanagerdemo.user.domain;

import io.micrometer.common.lang.NonNull;
import jakarta.annotation.Nonnull;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

/**
 * Clase userDao para los datos del usuario
 * 
 * @author Daniel García Mesa
 * @author Pablo Javier Muñoz García
 * @version 1.0
 * @since 12.04.2023
 */

public class UserDao {

  @NotBlank(message = "El nombre es obligatorio")
  private String nombre;
  @Email(message = "El formato del correo no es el adecuado")
  @NotBlank(message = "El correo no puede ser vacío")
  private String email;
  @NotBlank(message = "El primer apellido es obligatorio")
  private String primerApellido;
  private String segundoApellido;
  private Role rol;

  /**
   * Constructor vacio
   */
  public UserDao() {
    this("", "", "", "", null);
  }

  /**
   * Constructor de userdao
   * 
   * @param nombre
   * @param email
   * @param primerApellido
   * @param segundoApellido
   * @param rol
   */
  public UserDao(String nombre, String email, String primerApellido, String segundoApellido, Role rol) {
    this.nombre = nombre;
    this.email = email;
    this.primerApellido = primerApellido;
    this.segundoApellido = segundoApellido;
    this.rol = rol;
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
   * @param nombre valor que cambia nombre de userDao
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

  /**
   * getter para el rol del usuario
   * 
   * @return devuelve el rol del usuario
   */
  public Role getRole() {
    return rol;
  }

  /**
   * setter para el rol del usuario
   * 
   * @param rol valor que cambia el rol del usuario
   */
  public void setRole(Role rol) {
    this.rol = rol;
  }
}
