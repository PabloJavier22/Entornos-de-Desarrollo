package com.Pablo.Daniel.parkingmanagerdemo.sorteo;
import java.util.ArrayList;
import java.util.List;

public class SorteoRepository{

private ArrayList<Sorteo> sorteos;
public SorteoRepository() {
    sorteos = new ArrayList<>();
}
public List<Sorteo> getALL(){
    this.sorteos.clear();
    this.sorteos.add(new Sorteo("Primer sorteo plazas parking","01/02/2023","Terminado"));
    return this.sorteos;
    }
}