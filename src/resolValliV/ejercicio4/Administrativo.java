package resolValliV.ejercicio4;

import java.time.LocalTime;

public class Administrativo extends Empleado {
    private String tipoTrabajo;

    public Administrativo(String nombre, int dni, double sueldoBase, int antiguedad, String tipoTrabajo) {
        super(nombre, dni, sueldoBase, antiguedad);
        this.tipoTrabajo = tipoTrabajo;
    }
}
