package com.Pablo.Daniel.parkingmanagerdemo.user.adapter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.Pablo.Daniel.parkingmanagerdemo.user.service.UserService;

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
}
