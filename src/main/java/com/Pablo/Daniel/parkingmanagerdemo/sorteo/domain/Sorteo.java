package com.Pablo.Daniel.parkingmanagerdemo.sorteo.domain;

import java.util.Set;

import com.Pablo.Daniel.parkingmanagerdemo.user.domain.User;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

/**
 * Clase sorteo
 * 
 * @author Daniel García Mesa
 * @author Pablo Javier Muñoz García
 * @version 1.0
 * @since 12.04.2023
 */
@Entity
public class Sorteo {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int IDSrt;
  private String descripcion;
  private String fecha;
  private Status status;

  @ManyToMany(mappedBy = "includedIn")
  private Set<User> UsersIncluded;
  /**
   * Constructor vacío
   * 
   */
  public Sorteo() {
  }

  /**
   * Constructor con argumentos
   * 
   * @param IDSrt       ID de sorteo
   * @param descripcion descripción de sorteo
   * @param fecha       fecha de sorteo
   * @param status      estado de sorteo
   */
  public Sorteo(int IDSrt, String descripcion, String fecha, Status status) {
    this.descripcion = descripcion;
    this.fecha = fecha;
    this.status = status;
    this.IDSrt = IDSrt;
  }

  /**
   * getter del ID de sorteo
   * 
   * @return devuelve el ID del sorteo
   */
  public int getIDSrt() {
    return IDSrt;
  }

  /**
   * setter del ID del sorteo
   * 
   * @param iDSrt
   */
  public void setIDSrt(int iDSrt) {
    IDSrt = iDSrt;
  }

  /**
   * getter de la fecha del sorteo
   * 
   * @return devuelve la fecha del sorteo
   */
  public String getFecha() {
    return fecha;
  }

  /**
   * setter de la fecha del sorteo
   * 
   * @param fecha
   */
  public void setFecha(String fecha) {
    this.fecha = fecha;
  }

  /**
   * getter del estado del sorteo
   * 
   * @return devuelve el estado del sorteo
   */
  public Status getStatus() {
    return status;
  }

  /**
   * setter del estado del sorteo
   * 
   * @param estado
   */
  public void setStatus(Status status) {
    this.status = status;
  }

  /**
   * getter de la descripción de sorteo
   * 
   * @return devuelve la descripción del sorteo
   */
  public String getDescripcion() {
    return descripcion;
  }

  /**
   * setter de la descripción del sorteo
   * 
   * @param descripcion
   */
  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }
}
