package com.Pablo.Daniel.parkingmanagerdemo.sorteo.service;

import java.util.List;

import com.Pablo.Daniel.parkingmanagerdemo.sorteo.domain.Sorteo;
import com.Pablo.Daniel.parkingmanagerdemo.sorteo.domain.SorteoDao;

/**
 * Interfaz SorteoService
 * @author Daniel García Mesa 
 * @author Pablo Javier Muñoz García
 * @version 1.0
 * @since 12.04.2023
 */
public interface SorteoService {

  /**
  * Método que devuelve una lista de todos los Sorteos, utilizando el método findAll()
  * 
  * @return La lista de los sorteos
  */
  public List<Sorteo> readAll();
 /**
  * Método para registrar nuevos sorteos
  * 
  * @param sorteoDao
  */
  public void register(SorteoDao sorteoDao);
}