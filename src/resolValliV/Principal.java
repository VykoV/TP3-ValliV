package resolValliV;

import java.util.Scanner;
import resolValliV.ejercicio1.Ejercicio1;
import resolValliV.ejercicio2.Ejercicio2;
import resolValliV.ejercicio3.Ejercicio3;
import resolValliV.ejercicio4.Ejercicio4;
import resolValliV.ejercicio5.Ejercicio5;

public class Principal {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Inserte numero de ejercicio que quiere acceder " +
                "\n 1. Ejercicio 1: Registro de Estudiantes" +
                "\n 2. Ejercicio 2: Sistema de Registro de Vehículos"+
                "\n 3. Ejercicio 3: Cuenta Bancaria" +
                "\n 4. Ejercicio 4: Sistema de Gestión de Empleados" +
                "\n 5. Ejercicio 5: Sistema de Gestión de Préstamos Bancarios" +
                "\n 6. Salir");
        int opcion = scanner.nextInt();
        switch(opcion){
            case (1):
                Ejercicio1.ejecutar();
                break;
            case (2):
                Ejercicio2.ejecutar();
                break;
            case (3):
                Ejercicio3.ejecutar();
                break;
            case (4):
                Ejercicio4.ejecutar();
                break;
            case (5):
                Ejercicio5.ejecutar();
                break;
            case (6):
                System.exit(0);
                break;
            default:
                System.out.println("Opcion incorrecta. Ingrese un numero del 1-6");
                main(args);
                break;
        }
    }
}
