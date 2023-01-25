package com.Pablo.Daniel.parkingmanagerdemo.User;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    private UserRepository repository = new UserRepository();

    @GetMapping("/usuarios")
    public String displayUsers(){
        return "listaususarios";
    }
}
