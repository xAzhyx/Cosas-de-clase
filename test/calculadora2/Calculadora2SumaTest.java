/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora2;

import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value=Parameterized.class)

public class Calculadora2SumaTest {
    private int a;
    private int b;
    private int c;
    
    public Calculadora2SumaTest(int a, int b, int c) {
        this.a=a;
        this.b=b;
        this.c=c;   
    }
     @Parameters
        public static Iterable <Object[]> numeros(){
        return Arrays.asList(new Object [][]{
        {20,10,30},{30,2,32},{18,2,3}});
        }
        
    @Test
    public void testSuma() {
        System.out.println("suma");
        Calculadora2 calcu = new Calculadora2(a,b);
        int result = calcu.suma();
        assertEquals(c, result);
        
    }
}
