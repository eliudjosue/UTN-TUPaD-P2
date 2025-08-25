
package holamundo;

import static java.lang.Boolean.TRUE;
import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args) {
        
        /*2. Escribir y ejecutar un programa básico en Java.*/
        System.out.println(" ¡Hola Java! ");
        
        /*3. Crea un programa que declare las siguientes variables con valores asignados:
        a. String nombre
        b. int edad
        c. double altura
        d. boolean estudiante
        Imprime los valores en pantalla usando System.out.println().*/
        
        String nombre = "Eliud";
        int edad = 35;
        double altura = 1.80;
        boolean estudiante = TRUE;
        
        System.out.println("Mi nobre es " + nombre + " tengo " + edad + " años de edad y mido " + altura + "m. " + " Soy estudiante " + estudiante);
        
        /*4. Escribe un programa que solicite al usuario ingresar su nombre y edad, y luego
los muestre en pantalla. Usa Scanner para capturar los datos.
*/
        Scanner input = new Scanner(System.in);
        
        String nombre4;
        int Edad;
        
        System.out.println("Ingresa tu nombre");
        nombre4 = input.nextLine();
        
        System.out.println("Ingresa tu edad");
        Edad = Integer.parseInt(input.nextLine());
        
        System.out.println("Me llamo " + nombre4 + " Y tengo " + Edad + " Años");
        
        /*5. Escribe un programa que solicite dos números enteros y realice las siguientes
        operaciones:
        a. Suma
        b. Resta
        c. Multiplicación
        d. División
        Muestra los resultados en la consola.*/
        
        int Suma, Resta, Multiplicacion, Division, valor1, valor2;
        
        System.out.println("Ingrese el primer valor");
        valor1 = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese el segundo valor");
        valor2 = Integer.parseInt(input.nextLine());
        
        System.out.println("El valor de la Suma es " + (valor1 + valor2));
        System.out.println("El valor de la Resta es " + (valor1 - valor2));
        System.out.println("El valor de la Multiplicacion es " + (valor1 * valor2));
        System.out.println("El valor de la Division es " + ((double)valor1 / valor2));
        
        System.out.println("Nombre: Juan Pérez,\n Edad: 30 años,\n Dirección: Calle Falsa 123\n");
        
        /*8. Manejar conversiones de tipo y división en Java.
            a. Escribe un programa que divida dos números enteros ingresados por el
            usuario.
            b. Modifica el código para usar double en lugar de int y compara los
            resultados.
        
         Scanner input = new Scanner(System.in);*/

        System.out.print("Ingrese el primer valor (int): ");
        int num1 = Integer.parseInt(input.nextLine());

        System.out.print("Ingrese el segundo valor (int): ");
        int num2 = Integer.parseInt(input.nextLine());

        // División con int (cuidado con 0)
        if (num2 == 0) {
            System.out.println("Division con int: no se puede dividir por cero.");
        } else {
            System.out.println("Division con int: " + (num1 / num2)); // división entera
        }

       
        if (num2 == 0) {
            System.out.println("Division con double: infinito (division por 0).");
        } else {
            double resultado = (double) num1 / num2;
            System.out.printf("Division con double: %.4f%n", resultado);
        }

        
        /* 9. Corrige el siguiente código para que funcione correctamente. Explica qué error
tenía y cómo lo solucionaste.*/
        


        System.out.print("Ingresa tu nombre: ");
        String nombre9 = input.nextLine(); 

        System.out.println("Hola, " + nombre9);
        
        /*El código usaba scanner.nextInt() (lee un número entero) para guardar en una variable String. Eso es un error de tipo y además no sirve para texto. Lo reemplacé por scanner.nextLine(), que lee una línea completa como cadena (incluye espacios). También cierro el Scanner al final con close().*/
        
    }

}
