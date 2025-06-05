package resolValliV.ejercicio3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Cuenta {
    private int nroCuenta;
    private double saldo;
    private String titular;

    public Cuenta( int nroCuenta, double saldo, String titular) {
        this.nroCuenta = nroCuenta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public void depositar(double cantidad){
        this.saldo = this.saldo + cantidad;
        System.out.println("El saldo aumento a $" + this.saldo );
    }

    public void retirar(double cantidad){
        if(this.saldo >= cantidad){
            this.saldo= this.saldo-cantidad;
            System.out.println("Se ha retirado $" + cantidad);
        }else{
            System.out.println("Fondos insuficiente para realizar la transaccion");
        }
    }

    public void consultarSaldo(){
        System.out.println("Saldo actual: $" + this.saldo);
    }

    public void registrarTransaccion(String tipo, double monto){
        LocalDateTime fecha = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String fechaFormato = fecha.format(formato);

        System.out.println("Fecha de la transaccion: " + fechaFormato);
        System.out.println("Tipo de transaccion: " + tipo);
        System.out.println("Monto: $" + monto);

    }

}
