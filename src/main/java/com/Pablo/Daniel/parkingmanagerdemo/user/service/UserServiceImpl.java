package com.Pablo.Daniel.parkingmanagerdemo.user.service;

import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Pablo.Daniel.parkingmanagerdemo.core.exceptions.UserExistsException;
import com.Pablo.Daniel.parkingmanagerdemo.user.domain.User;
import com.Pablo.Daniel.parkingmanagerdemo.user.domain.UserDao;
import com.Pablo.Daniel.parkingmanagerdemo.user.domain.UserRepository;

/**
 * Clase UserServiceImpl implemnta UserService y redefine sus funciones
 * 
 * @author Daniel García Mesa
 * @author Pablo Javier Muñoz García
 * @version 1.0
 * @since 12.04.2023
 */

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    /**
     * Constructor de la clase
     * 
     * @param userRepository
     */
    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * Método que devuelve una lista de todos los usuarios, utilizando el metodo findaALL()
     * 
     * @return la lista de los usuarios
     */
    @Override
    public List<User> readAll() {
        return (List<User>) userRepository.findAll();
    }

    /**
     * Método para registrar nuevos usuarios
     * 
     * @param userDao
     */
    @Override
    public void register(UserDao userDao) throws UserExistsException{
      if(userExists(userDao.getEmail())){
        throw new UserExistsException();
      }
        User user = new User();
        BeanUtils.copyProperties(userDao, user);
        this.userRepository.save(user);
    }

    @Override
    public boolean userExists(String email) {
      
      return this.userRepository.findByEmail(email) != null ? true : false;
    }

}
