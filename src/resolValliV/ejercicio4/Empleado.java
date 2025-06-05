package resolValliV.ejercicio4;

import java.time.LocalTime;

public abstract class Empleado {
    protected String nombre;
    protected int dni;
    protected double sueldoBase;
    protected int antiguedad;

    public Empleado(String nombre, int dni, double sueldoBase, int antiguedad) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldoBase = sueldoBase;
        this.antiguedad = antiguedad;
    }
}
