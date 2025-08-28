package verificaciondeañobisiesto;

import java.util.Scanner;

public class VerificacionDeAñoBisiesto {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //1. Verificación de Año Bisiesto.
        //Escribe un programa en Java que solicite al usuario un año y determine si es
        //bisiesto. Un año es bisiesto si es divisible por 4, pero no por 100, salvo que sea
        //divisible por 400.
        int anio;

        System.out.println("Ingrese un año: ");
        anio = Integer.parseInt(input.nextLine());

        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println("El año " + anio + " es bisiesto.");
        } else {
            System.out.println("El año " + anio + " no es biciesto");
        }

        // 2. Determinar el Mayor de Tres Números.
        // Escribe un programa en Java que pida al usuario tres números enteros y
        // determine cuál es el mayor.
        int num1, num2, num3, mayor;
        System.out.println("Ingrese el primer numero ");
        num1 = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese el segundo numero ");
        num2 = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese el tercero numero ");
        num3 = Integer.parseInt(input.nextLine());

        mayor = Math.max(num1, Math.max(num2, num3));
        System.out.println("El mayor es: " + mayor);

        //Clasificación de Edad.
        //Escribe un programa en Java que solicite al usuario su edad y clasifique su
        //etapa de vida según la siguiente tabla:
        //Menor de 12 años: "Niño"
        //Entre 12 y 17 años: "Adolescente"
        //Entre 18 y 59 años: "Adulto"
        //60 años o más: "Adulto mayor"
        int edad;
        System.out.println("Ingresá tu edad: ");
        edad = Integer.parseInt(input.next());

        if ((edad <= 12) && (edad > 0)) {
            System.out.println("Eres un niño");
        } else if ((edad > 12) && (edad <= 17)) {
            System.out.println("Eres un adolecente");
        } else if ((edad >= 18) && (edad <= 59)) {
            System.out.println("Eres un adulto");
        } else if (edad >= 60) {
            System.out.println("Eres un adulto mayor");
        } else {
            System.out.println("Ingresa una edad valida");
        }

        //4. Calculadora de Descuento según categoría.
        //Escribe un programa que solicite al usuario el precio de un producto y
        //su categoría (A, B o C).
        //Luego, aplique los siguientes descuentos:
        //Categoría A: 10% de descuento
        //Categoría B: 15% de descuento
        //Categoría C: 20% de descuento
        //El programa debe mostrar el precio original, el descuento aplicado y el
        //precio final
        
        int precioProducto;
        char category;

        System.out.println("Ingresà el precio del producto: ");
        precioProducto = Integer.parseInt(input.next());
        System.out.println("Ingrese la categoría del producto (A, B o C): ");
        category = input.next().toLowerCase().charAt(0);

        switch (category) {
            case 'a':
                System.out.println("Descuento aplicado 10% \n" + "Precio final: " + (precioProducto - precioProducto * 0.1));
                break;
            case 'b':
                System.out.println("Descuento aplicado 15% \n" + "Precio final: " + (precioProducto - precioProducto * 0.15));
                break;
            case 'c':
                System.out.println("Descuento aplicado 20% \n" + "Precio final: " + (precioProducto - precioProducto * 0.2));
                break;
        }

        //5. Suma de Números Pares (while).
        //Escribe un programa que solicite números al usuario y sume solo los
        //números pares. El ciclo debe continuar hasta que el usuario ingrese el número
        //0, momento en el que se debe mostrar la suma total de los pares ingresados.
        int num, suma;
        suma = 0;

        do {
            System.out.print("Ingrese un número (0 para terminar) ");
            num = Integer.parseInt(input.next());
            if (num % 2 == 0) {
                suma += num;
            }
        } while (num != 0);

        System.out.println("La suma de los números pares es: " + suma);
    }

}
