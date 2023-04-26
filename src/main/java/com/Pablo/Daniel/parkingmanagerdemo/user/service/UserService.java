package com.Pablo.Daniel.parkingmanagerdemo.user.service;

import java.util.List;

import com.Pablo.Daniel.parkingmanagerdemo.core.exceptions.UserExistsException;
import com.Pablo.Daniel.parkingmanagerdemo.user.domain.*;

/**
 * La interfaz UserService gestiona los usuarios.
 * Proporciona dos métodos para leer usuarios y registrar uno nuevo
 * 
 * @author Daniel García Mesa
 * @author Pablo Javier Muñoz García
 * @version 1.0
 * @since 12.04.2023
 */

public interface UserService {
  
  /**
   * Este método devuelve una lista de todos los usuarios 
   * 
   * @return una lista de todos los usuarios 
   */
  public List<User> readAll();
  
  /**
   * registra userDao como un nuevo usuario.
   * 
   * @param userDao el UserDao que se registra como un nuevo usuario.
   */
  public void register(UserDao userDao) throws UserExistsException;
  /**
   * A partir del email dice si un usuario ya existe o no
   * 
   * @param email
   * @return si el usuario ya existe o no
   */
  public boolean userExists(String email);

}
