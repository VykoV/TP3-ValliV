package resolValliV.ejercicio5;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Cliente implements PrestamoCalculable {
    private String nombre;
    private int dni;
    private LocalDate fechaPrestamo;
    private double montoSolicitado;
    private LocalDate fechaPactadaPago;

    private LocalDate fechaPagoReal;

    public Cliente(String nombre, int dni, LocalDate fechaPrestamo, double montoSolicitado, LocalDate fechaPactadaPago) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaPrestamo = fechaPrestamo;
        this.montoSolicitado = montoSolicitado;
        this.fechaPactadaPago = fechaPactadaPago;
    }

    public String getNombre() {
        return nombre;
    }
    public int getDni() {
        return dni;
    }
    public double getMontoSolicitado() {
        return montoSolicitado;
    }
    public LocalDate getFechaPactadaPago() {
        return fechaPactadaPago;
    }

    public void setFechaPagoReal(LocalDate fechaPagoReal) {
        this.fechaPagoReal = fechaPagoReal;
    }

    public long calcularDiasAtraso() {
        if (fechaPagoReal == null || !fechaPagoReal.isAfter(fechaPactadaPago)) {
            return 0;
        }
        return ChronoUnit.DAYS.between(fechaPactadaPago, fechaPagoReal);
    }

    public double calcularPenalidad() {
        long diasAtraso = calcularDiasAtraso();
        return diasAtraso * 0.02 * montoSolicitado;
    }

    public double calcularMontoFinal(int meses) {
        double interes = calcularInteres(montoSolicitado, meses);
        double penalidad = calcularPenalidad();
        return montoSolicitado + interes + penalidad;
    }

    public abstract void mostrarInformacion(int meses);
}