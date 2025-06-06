package resolValliV.ejercicio4;

public class OperarioDeProduccion extends Empleado {
    private String turnoTrabajo;

    public OperarioDeProduccion(String nombre, int dni, double sueldoBase, int antiguedad, String turnoTrabajo) {
        super(nombre, dni, sueldoBase, antiguedad);
        this.turnoTrabajo = turnoTrabajo;
    }

    @Override
    public double calcularSalario() {
        double descuento;
        if(this.turnoTrabajo.trim().equalsIgnoreCase("diurno") ){
            descuento = 0.08;
        }else {
            descuento = 0.06;
        }
        double salarioConDescuento = getSueldoBase() * (1 - descuento);
        return aplicarBonificacion(salarioConDescuento);
    }

    @Override
    public void informacionEmpleado(){
        System.out.println(
                "Operario De Produccion " +
                        "\nNombre: " + getNombre() +
                        "\nDNI:" + getDni() +
                        "\nSueldo Base:" + getSueldoBase() +
                        "\nAntiguedad: " + getAntiguedad()+
                        "\nTrabajo:" + this.turnoTrabajo +
                        "\nSalario: $" + calcularSalario()
        );
    }
}
