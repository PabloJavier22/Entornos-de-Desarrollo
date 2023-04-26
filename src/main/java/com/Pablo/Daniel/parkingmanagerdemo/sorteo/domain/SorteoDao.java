package com.Pablo.Daniel.parkingmanagerdemo.sorteo.domain;

/**
 * Clase SorteoDao para los datos del sorteo
 * 
 * @author Daniel García Mesa
 * @author Pablo Javier Muñoz García
 * @version 1.0
 * @since 12.04.2023
 */
public class SorteoDao {

  private String descripcion;
  private String fecha;
  private String status;

  /**
   * Constructor vacío
   * 
   */
  public SorteoDao() {
    this("", "", "");
  }

  /**
   * Constructor con argumentos
   * 
   * @param descripcion descripción de sorteo
   * @param fecha       fecha de sorteo
   * @param estado      estado de sorteo
   */
  public SorteoDao(String descripcion, String fecha, String estado) {
    this.descripcion = descripcion;
    this.fecha = fecha;
    this.status = estado;
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
  public String getStatus() {
    return status;
  }

  /**
   * setter del estado del sorteo
   * 
   * @param estado
   */
  public void setStatus(String status) {
    this.status = status;
  }
}
