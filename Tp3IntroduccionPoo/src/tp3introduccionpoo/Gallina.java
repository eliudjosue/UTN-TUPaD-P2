
package tp3introduccionpoo;

public class Gallina {
    // Atributos
    private int idGallina;
    private int edad;         
    private int huevosPuestos;

    // Constructor
    public Gallina(int idGallina, int edad) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = 0; // al inicio no puso huevos
    }

    // Método para poner un huevo
    public void ponerHuevo() {
        huevosPuestos++;
        System.out.println("🐔 Gallina " + idGallina + " puso un huevo. Total: " + huevosPuestos);
    }

    // Método para envejecer
    public void envejecer() {
        edad++;
        System.out.println("⏳ Gallina " + idGallina + " ahora tiene " + edad + " años.");
    }

    // Método para mostrar el estado
    public void mostrarEstado() {
        System.out.println("ID Gallina: " + idGallina);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Huevos puestos: " + huevosPuestos);
        System.out.println("-----------------------------");
    }
}
