package com.example.githubActionsUnitTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllerTest {

    @Test
    void myMethodShouldReturnSum(){
        //arrange
        Controller controller = new Controller();

        //act
        int result = controller.myMethod(1,2);
        //assert
        assertEquals(3,result);
    }
@Test
    void divisionShouldReturnQuote(){

        //act
        Controller controller = new Controller();
        double result = controller.division(6,2);

        assertEquals(3,result);
    }

}