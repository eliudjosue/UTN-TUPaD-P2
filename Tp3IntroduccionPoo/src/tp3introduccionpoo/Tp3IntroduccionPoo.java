
package tp3introduccionpoo;


public class Tp3IntroduccionPoo {

    public static void main(String[] args) {
        
        // . Registro de Estudiantes 
        //  a. Crear una clase Estudiante con los atributos: nombre, apellido, curso, 
        //  calificación. 
        //  Métodos requeridos: mostrarInfo(), subirCalificacion(puntos), 
        //  bajarCalificacion(puntos). 
        //  Tarea: Instanciar a un estudiante, mostrar su información, aumentar y disminuir 
        //  calificaciones. 
        
        // Crear estudiante
        
        Estudiante estudiante1 = new Estudiante("Eliud", "Campos", "Programación II", 8.5);
        
        // Mostrar información inicial
        estudiante1.mostrarInfo();
        
        // Subir la calificación
        estudiante1.subirCalificacion(1.0);
        estudiante1.mostrarInfo();;
        
        // Bajar la calificación
        estudiante1.bajarCalificacion(0.5);
        estudiante1.mostrarInfo();
        

        //  Registro de Mascotas 
        //  a. Crear una clase Mascota con los atributos: nombre, especie, edad. 
        //  Métodos requeridos: mostrarInfo(), cumplirAnios(). 
        //  Tarea: Crear una mascota, mostrar su información, simular el paso del tiempo y 
        //  verificar los cambios. 
        
        // Crear una mascota
        Mascota m1 = new Mascota("Firulais", "perro", 3);

        // Mostrar información inicial
        m1.mostrarInfo();

        // Simular que pasa un año
        m1.cumplirAnios();
        m1.mostrarInfo();

        // Otro año más
        m1.cumplirAnios();
        m1.mostrarInfo();
        

        //  Encapsulamiento con la Clase Libro 
        //  a. Crear una clase Libro con atributos privados: titulo, autor, 
        //  añoPublicacion. 
        //  Métodos requeridos: Getters para todos los atributos. Setter con validación 
        //  para añoPublicacion. 
        //  Tarea: Crear un libro, intentar modificar el año con un valor inválido y luego con 
        //  uno válido, mostrar la información final. 
        
        
        // Crear un libro
        Libro libro1 = new Libro("La esperanza de Latinoamérica y las cinco claves de la innovación", "Andrés Oppenheimer", 2014);

        // Mostrar información inicial
        libro1.mostrarInfo();

        // Intentar asignar un año inválido
        libro1.setAñoPublicacion(-1500);

        // Intentar asignar un año válido
        libro1.setAñoPublicacion(2014);

        // Mostrar información final
        libro1.mostrarInfo();
        
        
        //  Gestión de Gallinas en Granja Digital 
        //  a. Crear una clase Gallina con los atributos: idGallina, edad, 
        //  huevosPuestos. 
        //  Métodos requeridos: ponerHuevo(), envejecer(), mostrarEstado(). 
        //  Tarea: Crear dos gallinas, simular sus acciones (envejecer y poner huevos), y 
        //  mostrar su estado. 
        
        
        // Crear dos gallinas
        Gallina g1 = new Gallina(1, 2);
        Gallina g2 = new Gallina(2, 1);

        // Acciones de la gallina 1
        g1.ponerHuevo();
        g1.ponerHuevo();
        g1.envejecer();

        // Acciones de la gallina 2
        g2.ponerHuevo();
        g2.envejecer();
        g2.envejecer();

        // Mostrar estado final de cada una
        g1.mostrarEstado();
        g2.mostrarEstado();
        

        //  5. Simulación de Nave Espacial 
        //  Crear una clase NaveEspacial con los atributos: nombre, combustible. 
        //  Métodos requeridos: despegar(), avanzar(distancia), 
        //  recargarCombustible(cantidad), mostrarEstado(). 
        //  Reglas: Validar que haya suficiente combustible antes de avanzar y evitar que 
        //  se supere el límite al recargar. 
        //  Tarea: Crear una nave con 50 unidades de combustible, intentar avanzar sin 
        //  recargar, luego recargar y avanzar correctamente. Mostrar el estado al final. 
        
        
        // Crear nave con 50 unidades de combustible
        NaveEspacial nave1 = new NaveEspacial("Star ship", 50);

        // Mostrar estado inicial
        nave1.mostrarEstado();

        // Intentar avanzar sin recargar (esto debería fallar si falta combustible)
        nave1.avanzar(30);

        // Recargar combustible
        nave1.recargarCombustible(40);

        // Intentar avanzar correctamente
        nave1.avanzar(20);

        // Mostrar estado final
        nave1.mostrarEstado();
    }
    
}
