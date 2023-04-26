package com.Pablo.Daniel.parkingmanagerdemo.user.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositorio para la entidad usuario, que permite realizar operaciones, hereda
 * de CrudRepository
 * 
 * @author Daniel García Mesa
 * @author Pablo Javier Muñoz García
 * @version 1.0
 * @since 12.04.2023
 */

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

  /**
   * Encuentra un usuario a partir de su email
   * 
   * @param email
   * @return el usuario con ese email
   */
  public User findByEmail(String email);

}