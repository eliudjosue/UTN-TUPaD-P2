
package tp3introduccionpoo;

public class Libro {
    // Atributos privados (encapsulamiento)
    private String titulo;
    private String autor;
    private int añoPublicacion;

    // Constructor
    public Libro(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        setAñoPublicacion(añoPublicacion); // usamos el setter para validar
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    // Setter con validación
    public void setAñoPublicacion(int añoPublicacion) {
        if (añoPublicacion > 0 && añoPublicacion <= 2025) { // validamos que sea razonable
            this.añoPublicacion = añoPublicacion;
        } else {
            System.out.println("⚠️ Año de publicación inválido: " + añoPublicacion);
        }
    }

    // Método para mostrar la información
    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de Publicación: " + añoPublicacion);
        System.out.println("-----------------------------");
    }
}
