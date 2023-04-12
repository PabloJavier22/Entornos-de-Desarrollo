package com.Pablo.Daniel.parkingmanagerdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.Pablo.Daniel.parkingmanagerdemo.user.domain.User;

public class TestUser {
    private User pablo;
    @BeforeEach
    public void init(){
     this.pablo = new User((long) 001,"Pablo Javier","Muñoz","García","pmungar@g.educaand.es","alumno");
    }
    @Test
    public void check_user_id(){
        //Arrange
        long esperado = 001;
        //Act
        long resultado = pablo.getidUsu();
        //Assert
        assertEquals(esperado, resultado);
    }
    @Test
    public void check_user_id_set(){
        //Arrange
        long esperado = 001;
        //Act
        pablo.setidUsu((long) 001);
        long resultado = pablo.getidUsu();
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
    @Test
    public void check_user_rol(){
        //Arrange
        String esperado = "alumno";
        //Act
        String resultado = pablo.getRol();
        //Assert
        assertEquals(esperado, resultado);
    }
    @Test
    public void check_user_rol_set(){
        //Arrange
        String esperado = "alumno";
        //Act
        pablo.setRol("alumno");
        String resultado = pablo.getRol();
        //Assert
        assertEquals(esperado, resultado);
    }

}
