package com.Pablo.Daniel.parkingmanagerdemo.sorteo.adapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.Pablo.Daniel.parkingmanagerdemo.sorteo.domain.SorteoRepository;
import com.Pablo.Daniel.parkingmanagerdemo.sorteo.service.SorteoService;

@Controller
public class SorteoController {

    private SorteoService sorteoService;

    public SorteoController(SorteoService sorteoService){
        this.sorteoService=sorteoService;
    }

    @GetMapping("/sorteos")
    public String displayUsers(Model model){
        model.addAttribute("sorteo", sorteoService.getAll());
        return "sorteos";
    }
}