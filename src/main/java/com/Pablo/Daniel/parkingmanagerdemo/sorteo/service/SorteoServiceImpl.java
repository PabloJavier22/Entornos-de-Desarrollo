package com.Pablo.Daniel.parkingmanagerdemo.sorteo.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Pablo.Daniel.parkingmanagerdemo.sorteo.domain.Sorteo;
import com.Pablo.Daniel.parkingmanagerdemo.sorteo.domain.SorteoDao;
import com.Pablo.Daniel.parkingmanagerdemo.sorteo.domain.SorteoRepository;

@Service
public class SorteoServiceImpl implements SorteoService{

  private SorteoRepository sorteoRepository;

    @Autowired
    public SorteoServiceImpl(SorteoRepository sorteoRepository){
        this.sorteoRepository = sorteoRepository;
    }

    @Override
    public List<Sorteo> readAll(){
        return (List<Sorteo>)sorteoRepository.findAll();
    }


    @Override
    public void register(SorteoDao sorteoDao){
        Sorteo sorteo = new Sorteo();
        BeanUtils.copyProperties(sorteoDao, sorteo);
        this.sorteoRepository.save(sorteo);
    }
}
