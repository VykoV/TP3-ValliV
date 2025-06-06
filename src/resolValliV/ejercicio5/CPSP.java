package resolValliV.ejercicio5;

import java.time.LocalDate;

public class CPSP extends Cliente {
    public CPSP(String nombre, int dni, LocalDate fechaPrestamo, double monto, LocalDate fechaPactadaPago) {
        super(nombre, dni, fechaPrestamo, monto, fechaPactadaPago);
    }

    @Override
    public double calcularInteres(double monto, int meses) {
        return monto * 0.10 * meses;
    }

    @Override
    public void mostrarInformacion(int meses) {
        System.out.println("Cliente que presta servicios publicos");
        mostrarDetallesGenerales(meses);
    }

    private void mostrarDetallesGenerales(int meses) {
        System.out.println("Nombre: " + getNombre() +
                            "\nDNI: " + getDni() +
                            "\nMonto solicitado: $" + getMontoSolicitado() +
                            "\nFecha pactada de pago: " + getFechaPactadaPago() +
                            "\nInterés total: $" + calcularInteres(getMontoSolicitado(), meses)
        );
        long diasAtraso = calcularDiasAtraso();
        if (diasAtraso > 0) {
            System.out.println("Días de atraso: " + diasAtraso +
                                "\nPenalidad: $" + calcularPenalidad());
        } else {
            System.out.println("Pago en término.");
        }
        System.out.println("Monto total a pagar: $" + calcularMontoFinal(meses));
    }
}