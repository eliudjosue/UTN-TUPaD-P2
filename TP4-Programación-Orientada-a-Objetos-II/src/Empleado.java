public class Empleado {
    // Encapsulamiento
    private int id;
    private String nombre;
    private String puesto;
    private double salario;

    // Miembros estáticos (contador y generador de id)
    private static int totalEmpleados = 0;
    private static int nextId = 1;

    // Salario por defecto para el ctor con (nombre, puesto)
    private static final double SALARIO_BASE = 800_000.0;

    // (1) Uso de this y (2) Constructor que recibe todos los atributos
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++; // (5) Contador global
    }

    // (2) Constructor sobrecargado: id automático y salario por defecto
    public Empleado(String nombre, String puesto) {
        this.id = nextId++;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = SALARIO_BASE;
        totalEmpleados++; // (5) Contador global
    }

    // (3) Métodos sobrecargados actualizarSalario
    // Porcentaje (ej: 10 = +10%)
    public void actualizarSalario(double porcentaje) {
        this.salario += this.salario * (porcentaje / 100.0);
    }

    // Monto fijo (sobrecarga por tipo distinto)
    public void actualizarSalario(int montoFijo) {
        this.salario += montoFijo;
    }

    // (4) toString legible
    @Override
    public String toString() {
        return "Empleado {id=" + id +
               ", nombre='" + nombre + '\'' +
               ", puesto='" + puesto + '\'' +
               ", salario=" + salario + "}";
    }

    // (5) Método estático que retorna el total creado
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    // (6) Getters y Setters (encapsulamiento)
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getPuesto() { return puesto; }
    public void setPuesto(String puesto) { this.puesto = puesto; }

    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }
}
