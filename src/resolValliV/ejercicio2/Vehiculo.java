package resolValliV.ejercicio2;

public class Vehiculo {
    private String marca;
    private int modelo;
    private double kilometros;

    public Vehiculo(String marca, int modelo, double kilometros) {
        this.marca = marca;
        this.modelo = modelo;
        this.kilometros = kilometros;
    }

    public void mostrarInformacion(){
        System.out.println("Marca = " + marca);
        System.out.println("Modelo = " + modelo);
        System.out.println("Kilometros = " + kilometros);
    }

    public void recorrer(int kms){
        this.kilometros= this.kilometros + kms;
        System.out.println(" Los kilometros que recorrio en total fueron: " + this.kilometros);
    }

    public void proximoServicio(){
        int base = (int) (this.kilometros / 10000);
        if (this.kilometros % 10000 != 0){
            base ++;
        }
        System.out.println("El proximo servicio tecnico es a los " + (base*10000) + " Km");
    }

}
