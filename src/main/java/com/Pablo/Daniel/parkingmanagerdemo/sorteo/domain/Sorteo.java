package com.Pablo.Daniel.parkingmanagerdemo.sorteo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Sorteo {   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int IDSrt;
    private String descripcion;
    private String fecha;
    private String estado; 

 public Sorteo(){}
 
 public Sorteo(int IDSrt, String descripcion, String fecha, String estado) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.estado = estado;
        this.IDSrt = IDSrt;
    }
    
    public int getIDSrt() {
        return IDSrt;
    }



    public void setIDSrt(int iDSrt) {
        IDSrt = iDSrt;
    }


    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
