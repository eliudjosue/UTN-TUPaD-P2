package verificaciondeañobisiesto;

import java.util.Scanner;

public class VerificacionDeAñoBisiesto {

    // funcion ejercicio 8
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        return precioBase + (precioBase * impuesto) - (precioBase * descuento);
    }

    // funcion ejercicio 9
    // a) calcular costo de envío
    public static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("Nacional")) {
            return peso * 5;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            return peso * 10;
        } else {
            System.out.println("⚠ Zona inválida, se tomará costo 0.");
            return 0;
        }
    }

// b) calcular total de compra
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

// funcion ejercicio 10
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }

// funcion del ejercicio 11
    // Variable global
    static double DESCUENTO_ESPECIAL = 0.10;

    // Método que usa la variable global
    public static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
        double precioFinal = precio - descuentoAplicado;

        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }

    // funcion del ejercicio 13
    // Función recursiva para mostrar precios
    public static void imprimirArray(double[] precios, int index) {
        if (index < precios.length) {
            System.out.println("Precio: $" + precios[index]);
            imprimirArray(precios, index + 1); // llamada recursiva
        }
    }

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
            case 'a' ->
                System.out.println("""
                                           Descuento aplicado 10% 
                                           Precio final: """ + (precioProducto - precioProducto * 0.1));
            case 'b' ->
                System.out.println("""
                                           Descuento aplicado 15% 
                                           Precio final: """ + (precioProducto - precioProducto * 0.15));
            case 'c' ->
                System.out.println("""
                                           Descuento aplicado 20% 
                                           Precio final: """ + (precioProducto - precioProducto * 0.2));
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

        //6. Contador de Positivos, Negativos y Ceros (for).  
        //Escribe un programa que pida al usuario ingresar 10 números enteros y 
        //cuente cuántos son positivos, negativos y cuántos son ceros. 
        //Ejemplo de entrada/salida: 
        //Ingrese el número 1: -5 
        //Ingrese el número 2: 3 
        //Ingrese el número 3: 0 
        //Ingrese el número 4: -1 
        //Ingrese el número 5: 6 
        //Ingrese el número 6: 0 
        //Ingrese el número 7: 9 
        //Ingrese el número 8: -3 
        //Ingrese el número 9: 4 
        //Ingrese el número 10: -8 
        //Resultados: 
        //Positivos: 4 
        //Negativos: 4 
        //Ceros: 2 
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        // Pedir 10 números al usuario
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int numero = input.nextInt();

            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }

        // Mostrar resultados
        System.out.println("\nResultados:");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);

        //7. Validación de Nota entre 0 y 10 (do-while). 
        //Escribe un programa que solicite al usuario una nota entre 0 y 10. Si el 
        //usuario ingresa un número fuera de este rango, debe seguir pidiéndole la nota 
        //hasta que ingrese un valor válido. 
        int nota;

        // El bucle se ejecuta al menos una vez
        do {
            System.out.print("Ingrese una nota entre 0 y 10: ");
            nota = input.nextInt();

            if (nota < 0 || nota > 10) {
                System.out.println("❌ Valor inválido. Intente nuevamente.");
            }
        } while (nota < 0 || nota > 10);

        System.out.println("✅ Nota válida ingresada: " + nota);

        //Funciones:  
        ///8. Cálculo del Precio Final con impuesto y descuento.  
        //Crea un método calcularPrecioFinal(double impuesto, double 
        //descuento) que calcule el precio final de un producto en un e-commerce. La 
        //fórmula es: 
        //PrecioFinal = PrecioBase + (PrecioBase×Impuesto) − (PrecioBase×Descuento) 
        //PrecioFinal = PrecioBase + (PrecioBase \times Impuesto) - (PrecioBase \times 
        //Descuento) 
        //Desde main(), solicita el precio base del producto, el porcentaje de 
        //impuesto y el porcentaje de descuento, llama al método y muestra el precio 
        //final. 
        //Ejemplo de entrada/salida: 
        //Ingrese el precio base del producto: 100 
        //Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): 10 
        //Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): 5 
        //El precio final del producto es: 105.0
        

        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = input.nextDouble();

        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double impuesto = input.nextDouble() / 100; // convertir a decimal

        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double descuento = input.nextDouble() / 100; // convertir a decimal

        // Llamada al método
        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);

        System.out.println("El precio final del producto es: " + precioFinal);

        //9.  Composición de funciones para calcular costo de envío y total de compra. 
        //a. calcularCostoEnvio(double peso, String zona): Calcula el costo de 
        //envío basado en la zona de envío (Nacional o Internacional) y el peso del 
        //paquete. 
        //Nacional: $5 por kg  
        //Internacional: $10 por kg 
        //b. calcularTotalCompra(double precioProducto, double 
        //costoEnvio): Usa calcularCostoEnvio para sumar el costo del producto con 
        //el costo de envío. 
        //Desde main(), solicita el peso del paquete, la zona de envío y el precio 
        //del producto. Luego, muestra el total a pagar. 
        //Ejemplo de entrada/salida: 
        //Ingrese el precio del producto: 50 
        //Ingrese el peso del paquete en kg: 2 
        //Ingrese la zona de envío (Nacional/Internacional): Nacional 
        //El costo de envío es: 10.0 
        //El total a pagar es: 60.0 
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto9 = input.nextDouble();

        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = input.nextDouble();

        input.nextLine(); // limpiar buffer
        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = input.nextLine();

        // Llamadas a los métodos
        double costoEnvio = calcularCostoEnvio(peso, zona);
        double total = calcularTotalCompra(precioProducto9, costoEnvio);

        // Mostrar resultados
        System.out.println("El costo de envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + total);

        //10. Actualización de stock a partir de venta y recepción de productos. 
        //Crea un método actualizarStock(int stockActual, int cantidadVendida, 
        //int cantidadRecibida), que calcule el nuevo stock después de una venta y 
        //recepción 
        //de productos: 
        //NuevoStock = StockActual − CantidadVendida + CantidadRecibida 
        //NuevoStock = CantidadVendida + CantidadRecibida 
        //Desde main(), solicita al usuario el stock actual, la cantidad vendida y la 
        //cantidad recibida, y muestra el stock actualizado. 
        //Ejemplo de entrada/salida: 
        //Ingrese el stock actual del producto: 50 
        //Ingrese la cantidad vendida: 20 
        //Ingrese la cantidad recibida: 30 
        //El nuevo stock del producto es: 60
        System.out.print("Ingrese el stock actual del producto: ");
        int stockActual = input.nextInt();

        System.out.print("Ingrese la cantidad vendida: ");
        int cantidadVendida = input.nextInt();

        System.out.print("Ingrese la cantidad recibida: ");
        int cantidadRecibida = input.nextInt();

        // Llamada al método
        int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);

        // Mostrar resultado
        System.out.println("El nuevo stock del producto es: " + nuevoStock);

        //11. Cálculo de descuento especial usando variable global. 
        //Declara una variable global Ejemplo de entrada/salida: = 0.10. Luego, crea un 
        //método calcularDescuentoEspecial(double precio) que use la variable global para 
        //calcular el descuento especial del 10%. 
        //Dentro del método, declara una variable local descuentoAplicado, almacena 
        //el valor del descuento y muestra el precio final con descuento. 
        //Ejemplo de entrada/salida: 
        //Ingrese el precio del producto: 200 
        //El descuento especial aplicado es: 20.0 
        //El precio final con descuento es: 180.0
        System.out.print("Ingrese el precio del producto: ");
        double precio11 = input.nextDouble();

        // Llamada al método
        calcularDescuentoEspecial(precio11);

        //Arrays y Recursividad:  
        //12.  Modificación de un array de precios y visualización de resultados.  
        //Crea un programa que: 
        //a. Declare e inicialice un array con los precios de algunos productos. 
        //b. Muestre los valores originales de los precios. 
        //c. Modifique el precio de un producto específico. 
        //d. Muestre los valores modificados. 
        //Salida esperada: 
        //Precios originales: 
        //Precio: $199.99 
        //Precio: $299.5 
        //Precio: $149.75 
        //Precio: $399.0 
        //Precio: $89.99 
        //Precios modificados: 
        //Precio: $199.99 
        //Precio: $299.5 
        //Precio: $129.99 
        //Precio: $399.0 
        //Precio: $89.99 
        //Conceptos Clave Aplicados: 
        //✔ Uso de arrays (double[]) para almacenar valores. 
        //✔ Recorrido del array con for-each para mostrar valores. 
        //✔ Modificación de un valor en un array mediante un índice. 
        //✔ Reimpresión del array después de la modificación.
        // a) Declarar e inicializar el array con precios
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        // b) Mostrar valores originales
        System.out.println("Precios originales:");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }

        // c) Modificar el precio de un producto específico (por ejemplo, el índice 2 → tercer producto)
        precios[2] = 129.99;

        // d) Mostrar valores modificados
        System.out.println("\nPrecios modificados:");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }

        //13.  Impresión recursiva de arrays antes y después de modificar un elemento. 
        //Crea un programa que: 
        //a. Declare e inicialice un array con los precios de algunos productos. 
        //b. Use una función recursiva para mostrar los precios originales. 
        //c. Modifique el precio de un producto específico. 
        //d. Use otra función recursiva para mostrar los valores modificados. 
        //Salida esperada: 
        //Precios originales: 
        //Precio: $199.99 
        //Precio: $299.5 
        //Precio: $149.75 
        //Precio: $399.0 
        //Precio: $89.99 
        //Precios modificados: 
        //Precio: $199.99 
        //Precio: $299.5 
        //Precio: $129.99 
        //Precio: $399.0 
        //Precio: $89.99 
        //Conceptos Clave Aplicados: 
        //✔ Uso de arrays (double[]) para almacenar valores. 
        //✔ Recorrido del array con una función recursiva en lugar de un bucle. 
        //✔ Modificación de un valor en un array mediante un índice. 
        //✔ Uso de un índice como parámetro en la recursión para recorrer el 
        //array.
        // a) Declarar e inicializar array
        double[] precios13 = {199.99, 299.5, 149.75, 399.0, 89.99};

        // b) Mostrar precios originales con función recursiva
        System.out.println("Precios originales:");
        imprimirArray(precios, 0);

        // c) Modificar el precio de un producto específico (tercer elemento → índice 2)
        precios13[2] = 129.99;

        // d) Mostrar precios modificados con función recursiva
        System.out.println("\nPrecios modificados:");
        imprimirArray(precios, 0);
    }

}
