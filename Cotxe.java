public class Cotxe {

        public static final String marca = "Peugeot";
        public static String model;
        public final int potencia;

        public Cotxe(String model, int potencia) {
            Cotxe.model = model;
            this.potencia = potencia;
        }
        public static void frenar() {
            System.out.println("El vehicle està frenant.");
        }

        public void accelerar() {
            System.out.println("El vehicle està accelerant.");
        }

}
