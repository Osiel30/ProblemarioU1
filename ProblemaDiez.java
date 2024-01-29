package edu.upvictoria.fpoo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaDiez {
    public static void main() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Ingrese la medida en pulgadas: ");
            double medidaEnPulgadas = Double.parseDouble(reader.readLine());

            double medidaEnMetros = PulgadasAMetros(medidaEnPulgadas);

            System.out.println("La medida en metros es: " + medidaEnMetros + " metros");

        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

    private static double PulgadasAMetros(double pulgadas) {
        final double FACTOR_CONVERSION = 0.0254;

        double medidaEnMetros = pulgadas * FACTOR_CONVERSION;

        return medidaEnMetros;
    }
}
