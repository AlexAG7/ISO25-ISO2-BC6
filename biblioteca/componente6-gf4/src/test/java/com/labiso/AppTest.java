package com.labiso;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest 
    extends TestCase
{
    
    private App.NoFunciona obj;

    public AppTest( String testName )
    {
        super( testName );
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        obj = new App.NoFunciona();
    }
    
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    public void testGetEdadInicial()
    {
        assertEquals(1, obj.getEdad()); 
    }

    public void testSetEdad()
    {
        int nuevaEdad = 42;
        obj.setEdad(nuevaEdad);
        assertEquals(nuevaEdad, obj.getEdad()); 
    }

    public void testVerificarEdadLegal_MayorDeEdad() {
        String resultado = obj.verificarEdadLegal(20);
        assertEquals("Mayor de edad", resultado);
    }
    
    public void testVerificarEdadLegal_MenorDeEdad() {
        String resultado = obj.verificarEdadLegal(15);
        assertEquals("Menor de edad", resultado);
    }

    public void testVerificarEdadLegal_Limite18() {
        String resultado = obj.verificarEdadLegal(18);
        assertEquals("Mayor de edad", resultado);
    }

    public void testAppSimple()
    {
        assertTrue(true);
    }
}