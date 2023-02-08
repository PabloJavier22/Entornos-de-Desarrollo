package com.Pablo.Daniel.parkingmanagerdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.Pablo.Daniel.parkingmanagerdemo.sorteo.Sorteo;

public class TestSorteo {
    private Sorteo sorteo;
    @BeforeEach
    public void init(){
     this.sorteo = new Sorteo(001,"Sorteo de prueba","01/02/2002","En curso");
    }

    @Test
    public void check_sorteo_IDSrt(){
        //Arrange
        int esperado = 001;
        //Act
        int resultado = sorteo.getIDSrt();
        //Assert
        assertEquals(esperado, resultado);
       }
    @Test
    public void check_sorteo_IDSrt_set(){
        //Arrange
        int esperado = 001;
        //Act
        sorteo.setIDSrt(001);
        int resultado = sorteo.getIDSrt();
        //Assert
        assertEquals(esperado, resultado);
       }
    @Test
    public void check_sorteo_desc(){
        //Arrange
        String esperado = "Sorteo de prueba";
        //Act
        String resultado = sorteo.getDescripcion();
        //Assert
        assertEquals(esperado, resultado);
    }
    @Test
    public void check_sorteo_desc_set(){
        //Arrange
        String esperado = "Sorteo de pruebas";
        //Act
        sorteo.setDescripcion("Sorteo de pruebas");
        String resultado = sorteo.getDescripcion();
        //Assert
        assertEquals(esperado, resultado);
    }
    @Test
    public void check_sorteo_fecha(){
        //Arrange
        String esperado = "01/02/2002";
        //Act
        String resultado = sorteo.getFecha();
        //Assert
        assertEquals(esperado, resultado);
    }
    @Test
    public void check_sorteo_fecha_set(){
        //Arrange
        String esperado = "03/02/2002";
        //Act
        sorteo.setFecha("03/02/2002");
        String resultado = sorteo.getFecha();
        //Assert
        assertEquals(esperado, resultado);
    }
    @Test
    public void check_sorteo_estado(){
        //Arrange
        String esperado = "En curso";
        //Act
        String resultado = sorteo.getEstado();
        //Assert
        assertEquals(esperado, resultado);
    }
    @Test
    public void check_sorteo_estado_set(){
        //Arrange
        String esperado = "En proceso";
        //Act
        sorteo.setEstado("En proceso");
        String resultado = sorteo.getEstado();
        //Assert
        assertEquals(esperado, resultado);
    }
}