package com.Pablo.Daniel.parkingmanagerdemo.sorteo.service;

import java.util.List;

import com.Pablo.Daniel.parkingmanagerdemo.sorteo.domain.Sorteo;
import com.Pablo.Daniel.parkingmanagerdemo.sorteo.domain.SorteoDao;

public interface SorteoService {
  
  public List<Sorteo> readAll();
 
  public void register(SorteoDao sorteoDao);
}