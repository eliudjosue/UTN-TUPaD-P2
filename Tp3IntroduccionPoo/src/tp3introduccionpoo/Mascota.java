
package tp3introduccionpoo;

public class Mascota {
    // Atributos
    private String nombre;
    private String especie;
    private int edad;
    
    // Costructor
    
    public Mascota(String nombre, String especie, int edad){
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }
    
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad);
        System.out.println("-------------------------------");
    }
    
    // Método para simular que cumple años
    public void cumplirAnios(){
        edad++;
        System.out.println(nombre + " ha cumplido un año más 🎉");
    }
}
