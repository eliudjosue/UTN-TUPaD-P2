
package tp3introduccionpoo;


public class Estudiante {
    // Atributos
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;
    
    // Constructor
    public Estudiante(String nombre, String apellido, String curso, double calificacion){
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }
    
     // Método para mostrar la información del estudiante
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificación: " + calificacion);
        System.out.println("-----------------------------");
    }
    
    //Metodo para subir la calificación
    public void subirCalificacion(double puntos){
        calificacion += puntos;
        System.out.println("Calificación aumentada en " + puntos + " puntos.");
    }
    
    //Metodo para subir la calificción
    public void bajarCalificacion(double puntos){
        calificacion -= puntos;
        System.out.println("Calificación reducida en " + puntos + " puntos.");
    }
}
