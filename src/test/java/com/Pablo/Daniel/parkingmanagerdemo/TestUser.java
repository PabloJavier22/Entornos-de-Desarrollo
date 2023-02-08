package com.Pablo.Daniel.parkingmanagerdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.Pablo.Daniel.parkingmanagerdemo.User.User;

public class TestUser {
    private User pablo;
    @BeforeEach
    public void init(){
     this.pablo = new User(1,"Pablo Javier","Muñoz","García","pmungar@g.educaand.es");
    }
    @Test
    public void check_user_id(){
        //Arrange
        int esperado = 1;
        //Act
        int resultado = pablo.getidUsu();
        //Assert
        assertEquals(esperado, resultado);
    }
    @Test
    public void check_user_id_set(){
        //Arrange
        int esperado = 2;
        //Act
        pablo.setidUsu(2);
        int resultado = pablo.getidUsu();
        //Assert
        assertEquals(esperado, resultado);
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
