package com.Pablo.Daniel.parkingmanagerdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.Pablo.Daniel.parkingmanagerdemo.User.User;

public class TestUser {
    private User pablo;
    @BeforeEach
    public void init(){
     this.pablo = new User("Pablo Javier","Muñoz","García","pmungar@g.educaand.es");
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
    public void check_user_apellido(){
        //Arrange
        String esperado = "Muñoz";
        //Act
        String resultado = pablo.getPrimerApellido();
        //Assert
        assertEquals(esperado, resultado);
    }
}
