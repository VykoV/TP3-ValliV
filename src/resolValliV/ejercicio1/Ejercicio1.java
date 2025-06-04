package resolValliV.ejercicio1;

public class Ejercicio1 {
    public static void ejecutar(){
        //objetos
        Estudiante estudiante1 = new Estudiante("Oliver Barea", 15 , 6.5 );
        Estudiante estudiante2 = new Estudiante("Baldomero Valls", 16, 10);
        Estudiante estudiante3 = new Estudiante("Israel Vela", 16 , 5.5);
        //metodos

        System.out.println("Datos del estudiante nro 1: ");
        estudiante1.mostrarInformacion();
        System.out.print("El estudiante ");
        estudiante1.aprobo();
        System.out.println("Datos del estudiante nro 2: ");
        estudiante2.mostrarInformacion();
        System.out.print("El estudiante ");
        estudiante2 .aprobo();
        System.out.println("Datos del estudiante nro 3: ");
        estudiante3.mostrarInformacion();
        System.out.print("El estudiante ");
        estudiante3.aprobo();

    }
}
