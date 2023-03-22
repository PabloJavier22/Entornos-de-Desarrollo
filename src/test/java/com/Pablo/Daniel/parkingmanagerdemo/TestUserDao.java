package com.Pablo.Daniel.parkingmanagerdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
  
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.Pablo.Daniel.parkingmanagerdemo.user.domain.UserDao;

public class TestUserDao {

      private UserDao pablo;
      @BeforeEach
      public void init(){
       this.pablo = new UserDao("Pablo Javier","pmungar@g.educaand.es","Muñoz","García");
      }
      @Test
      public void check_user_nombre(){
          //Arrange
          String esperado = "Pablo Javier";
          //Act
          String resultado = pablo.getNombre();
          //Assert
          assertEquals(esperado, resultado);
      }
      @Test
      public void check_user_set(){
          //Arrange
          String esperado = "Pablo Javier";
          //Act
          pablo.setNombre("Pablo Javier");
          String resultado = pablo.getNombre();
          //Assert
          assertEquals(esperado, resultado);
      }
  
      @Test
      public void check_user_primerApellido(){
          //Arrange
          String esperado = "Muñoz";
          //Act
          String resultado = pablo.getPrimerApellido();
          //Assert
          assertEquals(esperado, resultado);
      }
      @Test
      public void check_user_primerApellido_set(){
          //Arrange
          String esperado = "Muñoz";
          //Act
          pablo.setPrimerApellido("Muñoz");
          String resultado = pablo.getPrimerApellido();
          //Assert
          assertEquals(esperado, resultado);
      }
  
  
      @Test
      public void check_user_segundoApellido(){
          //Arrange
          String esperado = "García";
          //Act
          String resultado = pablo.getSegundoApellido();
          //Assert
          assertEquals(esperado, resultado);
      }
      @Test
      public void check_user_segundoApellido_set(){
          //Arrange
          String esperado = "García";
          //Act
          pablo.setSegundoApellido("García");
          String resultado = pablo.getSegundoApellido();
          //Assert
          assertEquals(esperado, resultado);
      }
  
  
      @Test
      public void check_user_correo(){
          //Arrange
          String esperado = "pmungar@g.educaand.es";
          //Act
          String resultado = pablo.getEmail();
          //Assert
          assertEquals(esperado, resultado);
      }
      @Test
      public void check_user_correo_set(){
          //Arrange
          String esperado = "pmungar@g.educaand.es";
          //Act
          pablo.setEmail("pmungar@g.educaand.es");
          String resultado = pablo.getEmail();
          //Assert
          assertEquals(esperado, resultado);
      }
  
  }
  
