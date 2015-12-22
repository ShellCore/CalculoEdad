import mx.shell.java.utils.Fechas;

public class Main {
    public static void main(String[] args) {
        String fecha = "28/12/1992";
        System.out.println("Fecha: " + fecha + ", edad: " + Fechas.calcularEdad(fecha));
        System.out.println("Fecha: " + fecha + ", edad: " + Fechas.calcularEdadViejito(fecha));
    }
}
