package tp3introduccionpoo;


public class Tp3IntroduccionPoo {

    public static void main(String[] args) {

    {   // === Registro de Estudiantes ===
        Estudiante estudiante1 = new Estudiante("Eliud", "Campos", "Programación II", 8.5);

        estudiante1.mostrarInfo();
        estudiante1.subirCalificacion(1.0);
        estudiante1.mostrarInfo();
        estudiante1.bajarCalificacion(0.5);
        estudiante1.mostrarInfo();
    }

    {   // === Registro de Mascotas ===
        Mascota m1 = new Mascota("Firulais", "perro", 3);

        m1.mostrarInfo();
        m1.cumplirAnios();
        m1.mostrarInfo();
        m1.cumplirAnios();
        m1.mostrarInfo();
    }

    {   // === Encapsulamiento con Libro ===
        Libro libro1 = new Libro("La esperanza...", "Andrés Oppenheimer", 2014);

        libro1.mostrarInfo();
        libro1.setAñoPublicacion(-1500);
        libro1.setAñoPublicacion(2014);
        libro1.mostrarInfo();
    }

    {   // === Gestión de Gallinas ===
        Gallina g1 = new Gallina(1, 2);
        Gallina g2 = new Gallina(2, 1);

        g1.ponerHuevo();
        g1.ponerHuevo();
        g1.envejecer();

        g2.ponerHuevo();
        g2.envejecer();
        g2.envejecer();

        g1.mostrarEstado();
        g2.mostrarEstado();
    }

    {   // === Simulación de Nave Espacial ===
        NaveEspacial nave1 = new NaveEspacial("Star ship", 50);

        nave1.mostrarEstado();
        nave1.avanzar(30);
        nave1.recargarCombustible(40);
        nave1.avanzar(20);
        nave1.mostrarEstado();
    }
}

}
