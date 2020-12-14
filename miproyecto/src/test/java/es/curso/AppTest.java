package es.curso;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @Test
    public static int pruebaDoblar()
    {
        int resultado=App.doblar(5);
        assertEquals( resultado, 10 );
    }
    
    @Test
    public static int pruebaDoblarCero()
    {
        int resultado=App.doblar(0);
        assertEquals( resultado, 0 );
    }
    
    @Test
    public static int pruebaDoblarNegativo()
    {
        int resultado=App.doblar(-5);
        assertEquals( resultado, -10 );
    }
    
    @Test
    public static int pruebaMayorPrimero()
    {
        int resultado=App.mayor(10, 5);
        assertEquals( resultado, 10 );
    }
    
    @Test
    public static int pruebaMayorSegundo()
    {
        int resultado=App.mayor(1, 5);
        assertEquals( resultado, 5 );
    }
    
    @Test
    public static int pruebaMayorIguales()
    {
        int resultado=App.mayor(5, 5);
        assertEquals( resultado, 5 );
    }
    
    @Test
    public static int pruebaMayorNegativos()
    {
        int resultado=App.mayor(5, -5);
        assertEquals( resultado, 5 );
    }
    
}
