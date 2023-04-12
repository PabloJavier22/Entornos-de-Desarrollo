package com.Pablo.Daniel.parkingmanagerdemo.user.adapter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.Pablo.Daniel.parkingmanagerdemo.user.service.UserService;
import com.Pablo.Daniel.parkingmanagerdemo.user.domain.UserDao;

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
    public String createUser(@ModelAttribute UserDao userDao){
        this.userService.register(userDao);
        return "redirect:/usuarios";
    }

}
