package resolValliV.ejercicio3;

public class Ejercicio3 {
    public static void ejecutar(){
        Cuenta cuenta1 = new Cuenta(1, 3000, "Oliver Barea" );
        Cuenta cuenta2 = new Cuenta(2, 10000, "Baldomero Valls" );

        System.out.println("Cuenta 1 " );
        cuenta1.consultarSaldo();

        cuenta1.registrarTransaccion("Deposito", 500);
        cuenta1.depositar(500);

        cuenta1.registrarTransaccion("retiro", 3000);
        cuenta1.retirar(3000);

        cuenta1.consultarSaldo();

        System.out.println("Cuenta 2 ");
        cuenta2.consultarSaldo();

        cuenta2.registrarTransaccion("Deposito", 500);
        cuenta2.depositar(500);

        cuenta2.registrarTransaccion("retiro", 10600);
        cuenta2.retirar(10600);

        cuenta2.consultarSaldo();

    }
}
