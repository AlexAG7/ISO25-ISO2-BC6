package com.labiso;

/**
 * Clase principal del componente 5. Contiene una clase interna con lógica.
 */
public class App 
{
    public static void main( String[] args )
    {
        NoFunciona que = new NoFunciona();
        System.out.println( "Mi edad es: " + que.getEdad());
        
        int edadPrueba = 20;
        String estado = que.verificarEdadLegal(edadPrueba);
        System.out.println("A los " + edadPrueba + " años, soy: " + estado);
    }


    public static class NoFunciona {

        private int edad;


        public NoFunciona(){
            this.edad = 1;
        }

        public int getEdad(){
            return this.edad;
        }
        public void setEdad(int nuevaEdad) {
            this.edad = nuevaEdad;
        }

        public String verificarEdadLegal(int edad) {
            if (edad >= 18) {
                return "Mayor de edad";
            } else {
                return "Menor de edad";
            }
        }

    }

}