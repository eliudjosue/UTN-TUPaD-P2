
package tp4.programación.orientada.a.objetos.ii;

public class TP4ProgramaciónOrientadaAObjetosII {

    public static void main(String[] args) {
        // Instancias con ambos constructores
        Empleado emp1 = new Empleado(100, "Ana Pérez", "Desarrolladora", 1_200_000);
        Empleado emp2 = new Empleado("Luis Gómez", "QA");   // id auto + salario base
        Empleado emp3 = new Empleado("Carla Díaz", "PM");   // id auto + salario base

        // Aumentos: porcentaje y monto fijo (sobrecarga)
        emp1.actualizarSalario(10);       // +10%
        emp2.actualizarSalario(100_000);  // +$100.000
        emp3.actualizarSalario(12.5);     // +12.5%

        // Imprimir con toString()
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);

        // Mostrar total de empleados creados (método estático)
        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());
    }

}
