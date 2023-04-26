package com.Pablo.Daniel.parkingmanagerdemo;

import com.Pablo.Daniel.parkingmanagerdemo.sorteo.domain.SorteoDao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestSorteoDao {
  private SorteoDao sorteo;
  @BeforeEach
  public void init(){
   this.sorteo = new SorteoDao("Sorteo de prueba","01/02/2002","En curso");
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
      String resultado = sorteo.getStatus();
      //Assert
      assertEquals(esperado, resultado);
  }
  @Test
  public void check_sorteo_estado_set(){
      //Arrange
      String esperado = "En proceso";
      //Act
      sorteo.setStatus("En proceso");
      String resultado = sorteo.getStatus();
      //Assert
      assertEquals(esperado, resultado);
  }
}

