package com.Pablo.Daniel.parkingmanagerdemo.user.adapter;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.Pablo.Daniel.parkingmanagerdemo.user.service.UserService;

import jakarta.validation.Valid;

import com.Pablo.Daniel.parkingmanagerdemo.user.domain.UserDao;
import com.Pablo.Daniel.parkingmanagerdemo.core.exceptions.UserExistsException;
import com.Pablo.Daniel.parkingmanagerdemo.user.domain.Role;

/**
 * Clase controller de usuarios
 * 
 * @author Daniel García Mesa
 * @author Pablo Javier Muñoz García
 * @version 1.0
 * @since 12.04.2023
 */
@Controller
public class UserController {

    private UserService userService;
    /**
     * Constructor de la clase
     * @param userService
     */
    public UserController(UserService userService){
        this.userService=userService;
    }

    /**
     * Controlador para mostrar la lista de sorteos
     * 
     * @param model
     * @return la lista de sorteos
     */
    @GetMapping("/usuarios")
    public String displayUsers(Model model){
        model.addAttribute("users", userService.readAll());
        return "user/listausuarios";
    }

    /**
     * Controlador para mostrar el formulario de creacion de sorteos
     * 
     * @param model
     * @return el formulario para crear un nuevo sorteo
     */
    @GetMapping("/createUser")
    public String displayRegistros(Model model){
      List<Role> roles = Arrays.asList(Role.values());
      model.addAttribute("roles", roles);
        UserDao userDao = new UserDao();
        model.addAttribute("userDao", userDao);
        return "user/registro";
    }

    /**
     * vuelve a la lista de sorteos tras la creación de uno nuevo
     * 
     * @param userDao
     * @return devuelve la pagina de la lista de sorteo
     */
    @PostMapping("/createUser")
    public String createUser(@Valid @ModelAttribute UserDao userDao, BindingResult bindingresult, Model model){
      //Si ocurre algún error de validación automática 
      if (bindingresult.hasErrors()){
        model.addAttribute("userDao", userDao);

        return "user/registro";
      }

      try{
        this.userService.register(userDao);
      }
      // Si ya existe un usuario con ese correo
        catch(UserExistsException e){
          model.addAttribute("userDao", userDao);
          bindingresult.reject("email", "Ya existe el usuario");
          return "user/registro";
          
        }
        return "redirect:/usuarios";
    }

}
