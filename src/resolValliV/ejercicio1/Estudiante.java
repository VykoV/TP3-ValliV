package resolValliV.ejercicio1;

public class Estudiante {
        //Atributo
        private String nombre;
        private int edad;
        private double notaFinal;

        public Estudiante(String nombre, int edad, double notaFinal){
            this.nombre =nombre;
            this.edad = edad;
            this.notaFinal = notaFinal;
        }

        //Metodo
        public void mostrarInformacion(){
            System.out.println("→ Nombre = " + this.nombre +
                    "\n→ Edad = " + this.edad +
                    "\n→ Nota = " + this.notaFinal);
        }

        public void aprobo() {

            if (this.notaFinal < 6) {
                System.out.println("Desaprobó");
            } else if (this.notaFinal >= 6 && this.notaFinal <= 8) {
                System.out.println("Regularizó");
            } else {
                System.out.println("Promocionó");
            }
        }
}
