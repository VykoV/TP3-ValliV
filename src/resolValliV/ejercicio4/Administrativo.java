package resolValliV.ejercicio4;

public class Administrativo extends Empleado {
    private String tipoTrabajo;

    public Administrativo(String nombre, int dni, double sueldoBase, int antiguedad, String tipoTrabajo) {
        super(nombre, dni, sueldoBase, antiguedad);
        this.tipoTrabajo = tipoTrabajo ;
    }

    @Override
    public double calcularSalario() {
        double descuento;
        if(this.tipoTrabajo.trim().equalsIgnoreCase("remoto") ){
            descuento = 0.12;
        }else {
            descuento = 0.08;
        }
        double salarioConDescuento = getSueldoBase() * (1 - descuento);
        return aplicarBonificacion(salarioConDescuento);
    }

    @Override
    public void informacionEmpleado(){
        System.out.println(
                "Administrativo " +
                "\nNombre: " + getNombre() +
                "\nDNI: " + getDni() +
                "\nSueldo Base: " + getSueldoBase() +
                "\nAntiguedad: " + getAntiguedad()+
                "\nTrabajo: " + this.tipoTrabajo +
                "\nSalario: $" + calcularSalario()
        );
    }

}
