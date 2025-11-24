package com.labiso;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        NoFunciona que = new NoFunciona();
        System.out.println( "Mi edad es: " + que.getEdad());
        
    }


    public static class NoFunciona{

        int edad;

        public NoFunciona(){
            this.edad = 1;
        }

        public int getEdad(){return this.edad;}

    }

}
