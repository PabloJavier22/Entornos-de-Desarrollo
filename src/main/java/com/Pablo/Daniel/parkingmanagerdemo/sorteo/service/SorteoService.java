package com.Pablo.Daniel.parkingmanagerdemo.sorteo.service;

import com.Pablo.Daniel.parkingmanagerdemo.sorteo.domain.Sorteo;
import com.Pablo.Daniel.parkingmanagerdemo.sorteo.domain.SorteoDao;

public interface SorteoService {
  
  public Iterable<Sorteo> getAll();
 
  public void register(SorteoDao sorteoDao);
}