package com.labiso;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    public void testSuma() {
        int a = 2;
        int b = 3;
        int resultadoEsperado = 5;
        int resultadoActual = a + b;
        assertEquals(resultadoEsperado, resultadoActual);
    }

    public void testEdad(){
        App.NoFunciona obj = new App.NoFunciona();
        int edadEsperada = 1;
        int edadActual = obj.getEdad();
        assertEquals(edadEsperada, edadActual);
    }

}
