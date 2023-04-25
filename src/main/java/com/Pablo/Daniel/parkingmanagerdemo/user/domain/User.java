package com.Pablo.Daniel.parkingmanagerdemo.user.domain;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

/**
 * Clase user
 * 
 * @author Daniel García Mesa
 * @author Pablo Javier Muñoz García
 * @version 1.0
 * @since 12.04.2023
 */

@Entity
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long idUsu;
  private String nombre;
  private String email;
  private String primerApellido;
  private String segundoApellido;
  private Role rol;


    
    
    @JoinTable(name = "user_in_sorteo",
                joinColumns = @JoinColumn(name = "user_id"),
                inverseJoinColumns = @JoinColumn(name = "sorteo_id"))
    @ManyToMany
    private Set<User> includedIn;
    /**
     * Constructor vacio
     */
    public User() {
    }
    
  /**
   * Constructor de user
   * 
   * @param idUsu           recoge la ID del usuario
   * @param nombre          recoge el nombre del usuario
   * @param primerApellido  recoge el primer apellido de usuario
   * @param segundoApellido recoge el segundo apellido de usuario
   * @param email           recoge el email del usuario
   * @param rol             recoge el rol del usuario
   */
  public User(long idUsu, String nombre, String primerApellido, String segundoApellido, String email, Role rol) {
    this.idUsu = idUsu;
    this.nombre = nombre;
    this.primerApellido = primerApellido;
    this.segundoApellido = segundoApellido;
    this.email = email;
    this.rol = rol;
  }

  /**
   * getter para la ID del usuario
   * 
   * @return devuelve el ID del usuario
   */
  public Long getidUsu() {
    return idUsu;
  }

  /**
   * setter para la ID del usuario
   * 
   * @param idUsu valor que cambia la ID del usuario
   */
  public void setidUsu(Long idUsu) {
    this.idUsu = idUsu;
  }

  /**
   * getter para Nombre del usuario
   * 
   * @return devuelve el nombre del usuario
   */
  public String getNombre() {
    return nombre;
  }

  /**
   * setter para el nombre del usuario
   * 
   * @param nombre valor que cambia el nombre del usuario
   */
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  /**
   * getter para el email del usuario
   * 
   * @return devuelve el email del usuario
   */
  public String getEmail() {
    return email;
  }

  /**
   * setter para el email del usuario
   * 
   * @param email valor que cambia el email del usuario
   */
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * getter para el primer apellido del usuario
   * 
   * @return devuelve el primer apellido del usuario
   */
  public String getPrimerApellido() {
    return primerApellido;
  }

  /**
   * setter para el primer apellido del usuario
   * 
   * @param primerApellido valor que cambia el primer apellido del usuario
   */
  public void setPrimerApellido(String primerApellido) {
    this.primerApellido = primerApellido;
  }

  /**
   * getter para el segundo apellido del usuario
   * 
   * @return devuevle el segundo apellido del usuario
   */
  public String getSegundoApellido() {
    return segundoApellido;
  }

  /**
   * setter para el segundo apellido del usuario
   * 
   * @param segundoApellido valor que cambia el segundo apellido del usuario
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
