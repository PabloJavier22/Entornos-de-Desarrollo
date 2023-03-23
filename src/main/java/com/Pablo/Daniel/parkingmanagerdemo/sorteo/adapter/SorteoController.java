package com.Pablo.Daniel.parkingmanagerdemo.sorteo.adapter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.Pablo.Daniel.parkingmanagerdemo.sorteo.domain.SorteoDao;
import com.Pablo.Daniel.parkingmanagerdemo.sorteo.service.SorteoService;

@Controller
public class SorteoController {

    private SorteoService sorteoService;

    public SorteoController(SorteoService sorteoService){
        this.sorteoService=sorteoService;
    }

    @GetMapping("/sorteos")
    public String displayUsers(Model model){
        model.addAttribute("sorteo", sorteoService.readAll());
        return "sorteo/sorteos";
    }

    @GetMapping("/createSorteo")
    public String displayRegistros(Model model){
        SorteoDao sorteoDao = new SorteoDao();
        model.addAttribute("sorteoDao", sorteoDao);
        return "sorteo/nuevosorteo";
    }

    @PostMapping("/createSorteo")
    public String createSorteo(@ModelAttribute SorteoDao sorteoDao){
        this.sorteoService.register(sorteoDao);
        return "redirect:/sorteos";
    }
}