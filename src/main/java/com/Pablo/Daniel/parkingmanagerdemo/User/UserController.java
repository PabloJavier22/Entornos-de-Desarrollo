package com.Pablo.Daniel.parkingmanagerdemo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping("/usuarios")
    public String displayUsers(Model model){
        model.addAttribute("users", repository.findAll());
        return "listausuarios";
    }
}
