package com.Pablo.Daniel.parkingmanagerdemo.sorteo.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositorio para la entidad Sorteo que permite realizar operaciones, hereda
 * de CrudRepository
 * 
 * @author Daniel García Mesa
 * @author Pablo Javier Muñoz García
 * @version 1.0
 * @since 12.04.2023
 */
@Repository
public interface SorteoRepository extends CrudRepository<Sorteo, Integer> {

}