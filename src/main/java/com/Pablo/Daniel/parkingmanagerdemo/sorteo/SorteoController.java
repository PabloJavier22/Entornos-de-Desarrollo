package com.Pablo.Daniel.parkingmanagerdemo.sorteo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SorteoController {

    @Autowired
    private SorteoRepository repository;

    @GetMapping("/sorteos")
    public String displayUsers(Model model){
        model.addAttribute("sorteo", repository.findAll());
        return "sorteos";
    }
}

