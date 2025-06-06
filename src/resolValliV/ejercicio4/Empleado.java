package resolValliV.ejercicio4;

public abstract class Empleado implements Calculable {
    private String nombre;
    private int dni;
    private double sueldoBase;
    private int antiguedad;
    private static int contadorEmpleados = 0;

    public Empleado(String nombre, int dni, double sueldoBase, int antiguedad) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldoBase = sueldoBase;
        this.antiguedad = antiguedad;

        contadorEmpleados++;
    }

    public String getNombre() {
        return nombre;
    }
    public int getDni() {
        return dni;
    }
    public double getSueldoBase() {
        return sueldoBase;
    }
    public int getAntiguedad() {
        return antiguedad;
    }

    public abstract void informacionEmpleado();

    protected double aplicarBonificacion(double sueldo) {
        if (antiguedad > 15) {
            return sueldo * 1.20;
        } else if (antiguedad > 10) {
            return sueldo * 1.15;
        } else if (antiguedad > 5) {
            return sueldo * 1.10;
        } else {
            return sueldo;
        }
    }

    public static int getCantidadEmpleados() {
        return contadorEmpleados;
    }

}
