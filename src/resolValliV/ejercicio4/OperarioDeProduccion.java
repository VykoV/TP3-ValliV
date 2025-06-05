package resolValliV.ejercicio4;

public class OperarioDeProduccion extends Empleado {
    private String turnoTrabajo;

    public OperarioDeProduccion(String nombre, int dni, double sueldoBase, int antiguedad, String turnoTrabajo) {
        super(nombre, dni, sueldoBase, antiguedad);
        this.turnoTrabajo = turnoTrabajo;
    }

}
