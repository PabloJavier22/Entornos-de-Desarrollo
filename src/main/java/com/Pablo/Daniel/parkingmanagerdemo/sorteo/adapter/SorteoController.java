package com.Pablo.Daniel.parkingmanagerdemo.sorteo.adapter;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.Pablo.Daniel.parkingmanagerdemo.sorteo.domain.SorteoDao;
import com.Pablo.Daniel.parkingmanagerdemo.sorteo.service.SorteoService;
import com.Pablo.Daniel.parkingmanagerdemo.sorteo.domain.Status;

/**
 * Clase controlador de sorteo
 * 
 * @author Daniel García Mesa
 * @author Pablo Javier Muñoz García
 * @version 1.0
 * @since 12.04.2023
 */
@Controller
public class SorteoController {

  private SorteoService sorteoService;

  /**
   * Constructor de la clase
   * 
   * @param sorteoService
   */
  public SorteoController(SorteoService sorteoService) {
    this.sorteoService = sorteoService;
  }

  /**
   * Controlador para mostrar la lista de sorteos
   * 
   * @param model
   * @return la lista de sorteos
   */
  @GetMapping("/sorteos")
  public String displayUsers(Model model) {
    model.addAttribute("sorteo", sorteoService.readAll());
    return "sorteo/sorteos";
  }

  /**
   * Controlador para mostrar el formulario de creación de sorteos
   * 
   * @param model
   * @return el formulario para crear un nuevo Sorteo
   */

  @GetMapping("/createSorteo")
  public String displayStatus(Model model){
    AsignarStatus(model);
      SorteoDao sorteoDao = new SorteoDao();
      model.addAttribute("sorteoDao", sorteoDao);
      return "sorteo/nuevosorteo";
  }

  private void AsignarStatus(Model model) {
    final List<Status> state = Arrays.asList(Status.values());
    model.addAttribute("status", state);
  }

  /**
   * Vuelve a la lista de sorteos tras la creación de uno nuevo
   * 
   * @param sorteoDao
   * @return devuelve la página de la lista de sorteos
   */
  @PostMapping("/createSorteo")
  public String createSorteo(@ModelAttribute SorteoDao sorteoDao) {
    this.sorteoService.register(sorteoDao);
    return "redirect:/sorteos";
  }
}