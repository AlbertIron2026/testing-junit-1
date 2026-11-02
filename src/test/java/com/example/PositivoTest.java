
package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

// archivo de Test, con @test para los metodos de prueba,
// y usar assert en sus diferentes modos

public class PositivoTest {

    @Test
    public void numPositivo() {
        int miNumero2 = Main.getNumero(-5); 
        /*assertEquals(5, miNumero2, "se esperaba un 5");
        assertTrue(miNumero2 >= 0, "el numero debe ser positivo");*/
        System.out.println("probando grupo de tests con assertAll");

        //assertAll() aunque uno falle, ejecuta TODOS los tests
       assertAll(
            () -> assertEquals(-5, miNumero2, "se esperaba un -5"),
            () -> assertTrue(miNumero2 <= 0, "el numero debe ser positivo"),
            () -> assertNotEquals(8, miNumero2, "se esperaba que NO fuera 8"),
            () -> assertNotNull(miNumero2, "El valor no debe ser nulo")
        );
  

    }

        
    @Test
    public void testNumeroIgualA5() {
        int miNumero = Main.getNumero(5);
        assertEquals(5, miNumero, "se esperaba un 5");
    }
    
    @Test
    public void testNumeroEsPositivo() {
        int miNumero = Main.getNumero(5);
        assertTrue(miNumero >= 0, "el numero NO debe ser positivo");
    }

    @Test
    public void testNumeroPositivo(){
        int miNumero2 = Main.getNumero(6);
        assertTrue(miNumero2 >=0, "El número debe ser positivo");
    }

    @Test
    public void testDebeSerIgualA6(){
        int miNumero3 = Main.getNumero(6);
        assertEquals(6, miNumero3, "Esperaba que fuera 6");
    }

    @Test
    public void testQueNumeroNoSeaNulo(){
        Integer miNumero4 = 10;
        assertNotNull(miNumero4, "El valor no debe ser nulo");
    }

}
