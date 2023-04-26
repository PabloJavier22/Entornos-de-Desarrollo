package com.Pablo.Daniel.parkingmanagerdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.Pablo.Daniel.parkingmanagerdemo.sorteo.domain.Status;
import com.Pablo.Daniel.parkingmanagerdemo.sorteo.domain.Sorteo;

import net.bytebuddy.implementation.bytecode.StackSize;

public class TestSorteo {
    private Sorteo sorteo;
    @BeforeEach
    public void init(){
     this.sorteo = new Sorteo(001,"Sorteo de prueba","01/02/2002",Status.STARTED);
    }

    @Test
    public void check_sorteo_IDSrt(){
        //Arrange
        long esperado = 001;
        //Act
        long resultado = sorteo.getIDSrt();
        //Assert
        assertEquals(esperado, resultado);
       }
    @Test
    public void check_sorteo_IDSrt_set(){
        //Arrange
        long esperado = 001;
        //Act
        sorteo.setIDSrt(001);
        long resultado = sorteo.getIDSrt();
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
        String esperado = "Sorteo de prueba";
        //Act
        sorteo.setDescripcion("Sorteo de prueba");
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
        Status esperado = Status.STARTED;
        //Act
        Status resultado = sorteo.getStatus();
        //Assert
        assertEquals(esperado, resultado);
    }
    @Test
    public void check_sorteo_estado_set(){
        //Arrange
        Status esperado = Status.STARTED;
        //Act
        sorteo.setStatus(Status.STARTED);
        Status resultado = sorteo.getStatus();
        //Assert
        assertEquals(esperado, resultado);
    }
}