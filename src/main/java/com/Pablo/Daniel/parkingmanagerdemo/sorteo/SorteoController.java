package com.Pablo.Daniel.parkingmanagerdemo.sorteo;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SorteoController {
    private SorteoRepository repository = new SorteoRepository();

    @GetMapping("/sorteos")
    public String displaySorteos(){
        return "sorteos";
    }
}
