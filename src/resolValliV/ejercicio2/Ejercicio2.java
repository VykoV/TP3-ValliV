package resolValliV.ejercicio2;

public class Ejercicio2{
    public static void ejecutar(){
        Vehiculo vehiculo1 = new Vehiculo("Toyota", 2021, 47300);
        Vehiculo vehiculo2 = new Vehiculo("Ford",2025, 10000);
        Vehiculo vehiculo3 = new Vehiculo("Chevrolet",2024,30500 );

        System.out.println("Vehiculo nro 1: ");
        vehiculo1.mostrarInformacion();
        System.out.print("El vehiculo recorrio 3000 km");
        vehiculo1.recorrer(3000);
        vehiculo1.proximoServicio();
        System.out.println("Vehiculo nro 2: ");
        vehiculo2.mostrarInformacion();
        System.out.print("El vehiculo recorrio 5000 km");
        vehiculo2.recorrer(5000);
        vehiculo2.proximoServicio();
        System.out.println("Vehiculo nro 3: ");
        vehiculo3.mostrarInformacion();
        System.out.print("El vehiculo recorrio 10000 km");
        vehiculo3.recorrer(10000);
        vehiculo3.proximoServicio();
    }


}
