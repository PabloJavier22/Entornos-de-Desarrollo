package com.Pablo.Daniel.parkingmanagerdemo.sorteo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Pablo.Daniel.parkingmanagerdemo.sorteo.domain.Sorteo;
import com.Pablo.Daniel.parkingmanagerdemo.sorteo.domain.SorteoRepository;

@Service
public class SorteoServiceImpl implements SorteoService{

  private SorteoRepository sorteoRepository;

  @Autowired
    public SorteoServiceImpl(SorteoRepository sorteoRepository){
        this.sorteoRepository = sorteoRepository;
    }

    @Override
    public Iterable<Sorteo> getAll(){
        return this.sorteoRepository.findAll();
    }
}