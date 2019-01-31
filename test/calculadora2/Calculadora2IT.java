/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author U_35007842
 */
public class Calculadora2IT {
    
    public Calculadora2IT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of suma method, of class Calculadora2.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        Calculadora2 instance = null;
        int expResult = 0;
        int result = instance.suma();
        assertEquals(expResult, result);
    }

    /**
     * Test of resta method, of class Calculadora2.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        Calculadora2 instance = null;
        int expResult = 0;
        int result = instance.resta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiplicar method, of class Calculadora2.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        Calculadora2 instance = null;
        int expResult = 0;
        int result = instance.multiplicar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dividir method, of class Calculadora2.
     */
    @Test
    public void testDividir() {
        System.out.println("dividir");
        Calculadora2 instance = null;
        int expResult = 0;
        int result = instance.dividir();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Calculadora2.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Calculadora2.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
