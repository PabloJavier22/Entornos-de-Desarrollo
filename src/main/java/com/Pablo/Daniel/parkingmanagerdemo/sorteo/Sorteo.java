package com.Pablo.Daniel.parkingmanagerdemo.sorteo;


public class Sorteo {    
    private int IDSrt;
    private String descripcion;
    private String fecha;
    private String estado; 


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
