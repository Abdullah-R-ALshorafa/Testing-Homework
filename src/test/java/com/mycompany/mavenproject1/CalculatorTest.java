/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.mavenproject1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author abdullah
 */
public class CalculatorTest {
    
    @Test
    public void testLetterGradeA() {
        Calculator calc = new Calculator();
        assertEquals("A", calc.getGradeLetter(95));
    }
    
    @Test
    public void testLetterGradeB() {
        Calculator calc = new Calculator();
        assertEquals("B", calc.getGradeLetter(85));
    }
    
    @Test
    public void testPassingGrade() {
        Calculator calc = new Calculator();
        assertTrue(calc.isPassing(75));
        assertFalse(calc.isPassing(55));
    }
}
