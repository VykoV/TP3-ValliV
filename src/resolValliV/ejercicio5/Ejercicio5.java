package resolValliV.ejercicio5;

import java.time.LocalDate;

public class Ejercicio5 {
    public static void ejecutar() {
        Cliente cliente1 = new Jubilado("Mario Perez", 12345678, LocalDate.of(2025, 1, 10), 100000, LocalDate.of(2025, 5, 10));
        Cliente cliente2 = new CPSP("Laura Torres", 87654321, LocalDate.of(2025, 2, 5), 120000, LocalDate.of(2025, 6, 5));
        Cliente cliente3 = new CNPSP("Carlos Gomez", 11223344, LocalDate.of(2025, 3, 15), 90000, LocalDate.of(2025, 6, 1));

        cliente1.setFechaPagoReal(LocalDate.of(2025, 5, 12)); // 2 días de atraso
        cliente2.setFechaPagoReal(LocalDate.of(2025, 6, 5));  // pago en término
        cliente3.setFechaPagoReal(LocalDate.of(2025, 6, 10)); // 9 días de atraso

        cliente1.mostrarInformacion(6);
        System.out.println();
        cliente2.mostrarInformacion(4);
        System.out.println();
        cliente3.mostrarInformacion(3);
    }
}