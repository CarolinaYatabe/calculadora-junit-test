
package calculadorajunit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CalculadoraTest {
    
    public CalculadoraTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {

    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of somarDoisPositivos method, of class Calculadora.
     */
    @Test
    public void testSomarDoisPositivos() {
        Calculadora calc = new Calculadora();
        int SomarDoisPositivos = calc.somarDoisPositivos(8, 4);
                
        assertEquals(12, SomarDoisPositivos);
    }

    /**
     * Test of somarUmPositivoUmNegativo method, of class Calculadora.
     */
    
    @SuppressWarnings("deprecation")
    @Test
    public void testSomarUmPositivoUmNegativo() {
        Calculadora calc = new Calculadora();
        int SomarUmPositivoUmNegativo = calc.somarUmPositivoUmNegativo(8, 4);
        
        assertEquals(4, SomarUmPositivoUmNegativo);
    }

    /**
     * Test of somarDoisNegativos method, of class Calculadora.
     */
    
    @SuppressWarnings("deprecation")
    @Test
    public void testSomarDoisNegativos() {
        Calculadora calc = new Calculadora();
        int SomarDoisNegativos = calc.somarDoisNegativos(8, 4);
        
        assertEquals(-12, SomarDoisNegativos);

    }

    /**
     * Test of somarUmZero method, of class Calculadora.
     */
    
    @SuppressWarnings("deprecation")
    @Test
    public void testSomarUmZero() {
        Calculadora calc = new Calculadora();
        int SomarUmZero = calc.somarUmZero(8, 4);
        
        assertEquals(8, SomarUmZero);
    }

    /**
     * Test of somarDoisZeros method, of class Calculadora.
     */
    
    @SuppressWarnings("deprecation")
    @Test
    public void testSomarDoisZeros() {
        Calculadora calc = new Calculadora();
        int SomarDoisZeros = calc.somarDoisZeros(8, 4);
        
        assertEquals(0,SomarDoisZeros);
    }

    /**
     * Test of subtrairDoisPositivos method, of class Calculadora.
     */
    
    @SuppressWarnings("deprecation")
    @Test
    public void testSubtrairDoisPositivos() {
        Calculadora calc = new Calculadora();
        int SubtrairDoisPositivos = calc.subtrairDoisPositivos(8, 4);
        
        assertEquals(4, SubtrairDoisPositivos);
    }

    /**
     * Test of subtrairDoisNegativos method, of class Calculadora.
     */
    
    @SuppressWarnings("deprecation")
    @Test
    public void testSubtrairDoisNegativos() {
        Calculadora calc = new Calculadora();
        int SubtrairDoisNegativos = calc.subtrairDoisNegativos(8, 4);
        
        assertEquals(-4, SubtrairDoisNegativos);
    }

    /**
     * Test of subtrairUmNegativo method, of class Calculadora.
     */
    
    @SuppressWarnings("deprecation")
    @Test
    public void testSubtrairUmNegativo() {
        Calculadora calc = new Calculadora();
        int SubtrairUmNegativo = calc.subtrairUmNegativo(8, 4);
        
        assertEquals(-12, SubtrairUmNegativo);
    }

    /**
     * Test of subtrairUmZero method, of class Calculadora.
     */
    
    @SuppressWarnings("deprecation")
    @Test
    public void testSubtrairUmZero() {
        Calculadora calc = new Calculadora();
        int SubtrairUmZero = calc.subtrairUmZero(8, 4);
        
        assertEquals(8, SubtrairUmZero);
    }

    /**
     * Test of subtrairDoisZeros method, of class Calculadora.
     */
    
    @SuppressWarnings("deprecation")
    @Test
    public void testSubtrairDoisZeros() {
        Calculadora calc = new Calculadora();
        int SubtrairDoisZeros = calc.subtrairDoisZeros(8, 4);
       
        assertEquals(0, SubtrairDoisZeros);
    }

    /**
     * Test of multiplicarDoisPositivos method, of class Calculadora.
     */
    
    @SuppressWarnings("deprecation")
    @Test
    public void testMultiplicarDoisPositivos() {
        Calculadora calc = new Calculadora();
        int MultiplicarDoisPositivos = calc.multiplicarDoisPositivos(8, 4);
        
        assertEquals(32, MultiplicarDoisPositivos);
    }

    /**
     * Test of multiplicarDoisNegativos method, of class Calculadora.
     */
    
    @SuppressWarnings("deprecation")
    @Test
    public void testMultiplicarDoisNegativos() {
        Calculadora calc = new Calculadora();
        int MultiplicarDoisNegativos = calc.multiplicarDoisNegativos(8, 4);
        
        assertEquals(32, MultiplicarDoisNegativos);

    }

    /**
     * Test of multiplicarUmNegativo method, of class Calculadora.
     */
    
    @SuppressWarnings("deprecation")
    @Test
    public void testMultiplicarUmNegativo() {
        Calculadora calc = new Calculadora();
        int MultiplicarUmNegativo = calc.multiplicarUmNegativo(8, 4);
        
        assertEquals(-32, MultiplicarUmNegativo);
    }

    /**
     * Test of multiplicarUmZero method, of class Calculadora.
     */
    
    @SuppressWarnings("deprecation")
    @Test
    public void testMultiplicarUmZero() {
        Calculadora calc = new Calculadora();
        int MultiplicarUmZero = calc.multiplicarUmZero(8, 4);
        
        assertEquals(0, MultiplicarUmZero);
    }

    /**
     * Test of multiplicarDoisZeros method, of class Calculadora.
     */
    
    @SuppressWarnings("deprecation")
    @Test
    public void testMultiplicarDoisZeros() {
        Calculadora calc = new Calculadora();
        int MultiplicarDoisZeros = calc.multiplicarDoisZeros(8, 4);
        
        assertEquals(0, MultiplicarDoisZeros);

    }

    /**
     * Test of dividirDoisPositivos method, of class Calculadora.
     */
    
    @SuppressWarnings("deprecation")
    @Test
    public void testDividirDoisPositivos() {
        Calculadora calc = new Calculadora();
        int DividirDoisPositivos = calc.dividirDoisPositivos(8, 4);
        
        assertEquals(2, DividirDoisPositivos);
    }

    /**
     * Test of dividirDoisNegativos method, of class Calculadora.
     */
    
    @SuppressWarnings("deprecation")
    @Test
    public void testDividirDoisNegativos() {
        Calculadora calc = new Calculadora();
        int DividirDoisNegativos = calc.dividirDoisNegativos(8, 4);
        
        assertEquals(2, DividirDoisNegativos);
    }

    /**
     * Test of dividirUmNegativo method, of class Calculadora.
     */
    
    @SuppressWarnings("deprecation")
    @Test
    public void testDividirUmNegativo() {
        Calculadora calc = new Calculadora();
        int DividirUmNegativo = calc.dividirUmNegativo(8, 4);
        
        assertEquals(-2, DividirUmNegativo);
    }

    /**
     * Test of dividirUmZero method, of class Calculadora.
     */
    
    @SuppressWarnings("deprecation")
    @Test
    public void testDividirUmZero() {
        Calculadora calc = new Calculadora();
        int DividirUmZero = calc.dividirUmZero(8, 4);

        assertEquals("Esse teste e o valor com divisao por zero", DividirUmZero);
    }

    /**
     * Test of dividirDoisZeros method, of class Calculadora.
     */
    
    @SuppressWarnings("deprecation")
    @Test
    public void testDividirDoisZeros() {
        Calculadora calc = new Calculadora();
        int DividirDoisZeros = calc.dividirDoisZeros(8, 4);
        
        assertEquals("Esse teste e o valor com divisao de zero por zero", DividirDoisZeros);
    }    
}
