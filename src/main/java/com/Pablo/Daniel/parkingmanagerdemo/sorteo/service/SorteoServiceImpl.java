package com.Pablo.Daniel.parkingmanagerdemo.sorteo.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Pablo.Daniel.parkingmanagerdemo.sorteo.domain.Sorteo;
import com.Pablo.Daniel.parkingmanagerdemo.sorteo.domain.SorteoDao;
import com.Pablo.Daniel.parkingmanagerdemo.sorteo.domain.SorteoRepository;

/**
 * Clase SorteoServiceImpl implementa SorteoService y redefine sus funciones
 * 
 * @author Daniel García Mesa
 * @author Pablo Javier Muñoz García
 * @version 1.0
 * @since 12.04.2023
 */
@Service
public class SorteoServiceImpl implements SorteoService {

  private SorteoRepository sorteoRepository;

  /**
   * Constructor de la clase
   * 
   * @param sorteoRepository
   */
  @Autowired
  public SorteoServiceImpl(SorteoRepository sorteoRepository) {
    this.sorteoRepository = sorteoRepository;
  }

  /**
   * Método que devuelve una lista de todos los Sorteos, utilizando el método
   * findAll()
   * 
   * @return La lista de los sorteos
   */
  @Override
  public List<Sorteo> readAll() {
    return (List<Sorteo>) sorteoRepository.findAll();
  }

  /**
   * Método para registrar nuevos sorteos
   * 
   * @param sorteoDao
   */
  @Override
  public void register(SorteoDao sorteoDao) {
    Sorteo sorteo = new Sorteo();
    BeanUtils.copyProperties(sorteoDao, sorteo);
    this.sorteoRepository.save(sorteo);
  }
}
