package com.Pablo.Daniel.parkingmanagerdemo.user.adapter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.Pablo.Daniel.parkingmanagerdemo.user.service.UserService;
import com.Pablo.Daniel.parkingmanagerdemo.user.domain.UserDao;

@Controller
public class UserController {

    private UserService userService;

    public UserController(UserService userService){
        this.userService=userService;
    }

    @GetMapping("/usuarios")
    public String displayUsers(Model model){
        model.addAttribute("users", userService.readAll());
        return "user/listausuarios";
    }

    @GetMapping("/registros")
    public String displayRegistros(Model model){
        UserDao userDao = new UserDao();
        model.addAttribute("registro", userDao);
        return "user/registro";
    }

    @PostMapping("/finalizarregistros")
    public String createUser(@ModelAttribute UserDao userDao){
        this.userService.register(userDao);
        return "redirect:/listausuarios";
    }

}
