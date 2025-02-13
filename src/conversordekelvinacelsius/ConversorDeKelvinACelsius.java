package conversordekelvinacelsius;

import java.util.Scanner;

/**
 *  Una conversora de temperaturas que convierte de grados Celsius a grados
 * Kelvin o viceversa.
 *
 * @author Carlos
 */
public class ConversorDeKelvinACelsius {

    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        // Variables
        boolean deciCorrecta = true;
        char letra = '\u0000';

        System.out.println("Esto es un conversos de celsius a kelvil o viceversa:");
        System.out.println("Introduce c para pasar de celsius a kelvin o k para kelvin a celsius");

        while (deciCorrecta) {
            letra = leerEntrada(); //guarda la letra leida por la funcion en el char letra

            //en funcion de la letra que introdujo el usuario ejecuta una funcion de conversion u otra
            switch (letra) {
                case 'c':
                    conversionACelsius();
                    deciCorrecta = false; //pone decir corercta a false para salir del bucle while que usa para pedir 
                    break;
                case 'k':
                    conversionAkelvin();
                    deciCorrecta = false;
                    break;
                default:
                    System.out.println("caracter invalido");
            }
        }
        //Despedida
        System.out.println("Un placer serte util para seguir realizando conversiones vuelve a ejecutar el programa :)");

    }

    //lee la entrada del usuario y lo guarda en un char en minuscula
    private static char leerEntrada() {
        String entrada = "";
        entrada = reader.next().toLowerCase();
        return entrada.charAt(0);
    }

    //realiza conversion de celsius a kelvin de un numero dado por el usuario
    private static void conversionAkelvin() {
        double celsius = 0;
        double kelvin = 0;
        
        System.out.println("Introduce los grados C: ");
        //pide la enttrada:
        celsius = reader.nextDouble();
        //realiza la conversion
        kelvin = celsius + 273.15;
        //muestra el resultado
        System.out.println(celsius + "ºC equivalen a: " + kelvin + "ºK");
    }

    private static void conversionACelsius() {
        double celsius = 0;
        double kelvin = 0;
        
        System.out.println("Introduce los grados k: ");
        //pide la enttrada:
        kelvin = reader.nextDouble();
        //reealiza la conversion
        celsius = kelvin - 273.15;
        //muestra el resultado
        System.out.println( kelvin+ " ºK equivalen a: " + celsius + " ºC");        
    }
}
