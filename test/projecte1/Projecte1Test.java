/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecte1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuari
 */
public class Projecte1Test {
    
    public Projecte1Test() {
    }

    @Test
    public void testMain() {
    }

    @Test
    public void testSuma() {
        Projecte1 p=new Projecte1();
        assertEquals(2+3,p.suma(2, 3));
    }
    
}
