package edu.upvictoria.fpoo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaDiecisiete{

    public static void main() {
        double cateto1 = LongitudCateto("Cateto 1");
        double cateto2 = LongitudCateto("Cateto 2");

        double hipotenusa = Hipotenusa(cateto1, cateto2);

        System.out.println("La hipotenusa del triángulo rectángulo es: " + hipotenusa);
    }

    public static double LongitudCateto(String nombreCateto) {
        double longitud = 0.0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Ingrese la longitud de " + nombreCateto + ": ");
            longitud = Double.parseDouble(br.readLine());
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }

        return longitud;
    }

    public static double Hipotenusa(double cateto1, double cateto2) {
        return Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
    }
}
