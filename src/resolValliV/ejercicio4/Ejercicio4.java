package resolValliV.ejercicio4;

public class Ejercicio4 {
    public static void ejecutar() {
        Administrativo admin = new Administrativo("Ana López", 12345678, 50000, 12, "Remoto");
        OperarioDeProduccion prod = new OperarioDeProduccion("Carlos Ruiz", 87654321, 45000, 6, "nocturno");

        admin.informacionEmpleado();
        System.out.println();
        prod.informacionEmpleado();

        System.out.println("\nTotal de empleados registrados: " + Empleado.getCantidadEmpleados());
    }
}
