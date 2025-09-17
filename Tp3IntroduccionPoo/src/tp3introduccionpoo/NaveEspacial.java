
package tp3introduccionpoo;

public class NaveEspacial {
    // Atributos
    private String nombre;
    private int combustible;
    private final int MAX_COMBUSTIBLE = 100; // límite máximo

    // Constructor
    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        if (combustible <= MAX_COMBUSTIBLE) {
            this.combustible = combustible;
        } else {
            this.combustible = MAX_COMBUSTIBLE;
        }
    }

    // Método para despegar
    public void despegar() {
        if (combustible >= 10) {
            combustible -= 10;
            System.out.println("🚀 " + nombre + " ha despegado.");
        } else {
            System.out.println("⚠️ No hay suficiente combustible para despegar.");
        }
    }

    // Método para avanzar cierta distancia
    public void avanzar(int distancia) {
        int consumo = distancia * 2; // regla: cada unidad de distancia consume 2 de combustible
        if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println("🛰️ " + nombre + " avanzó " + distancia + " km.");
        } else {
            System.out.println("⚠️ No hay suficiente combustible para avanzar " + distancia + " km.");
        }
    }

    // Método para recargar combustible
    public void recargarCombustible(int cantidad) {
        if (combustible + cantidad <= MAX_COMBUSTIBLE) {
            combustible += cantidad;
            System.out.println("⛽ Se recargaron " + cantidad + " unidades de combustible.");
        } else {
            combustible = MAX_COMBUSTIBLE;
            System.out.println("⛽ Se recargó al máximo de " + MAX_COMBUSTIBLE + " unidades.");
        }
    }

    // Método para mostrar estado
    public void mostrarEstado() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Combustible: " + combustible + "/" + MAX_COMBUSTIBLE);
        System.out.println("-----------------------------");
    }
}
