package edu.upvictoria.fpoo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaDieciseis{

    public static void main() {
        double precioPorMetroCuadrado = 15.0;
        double metrosCuadrados = MetrosCuadrados();

        double costoTotal = CostoTotal(metrosCuadrados, precioPorMetroCuadrado);

        System.out.println("El costo por pintar " + metrosCuadrados + " metros cuadrados es: $" + costoTotal);
    }

    private static double MetrosCuadrados() {
        double metrosCuadrados = 0.0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Ingrese la cantidad de metros cuadrados a pintar: ");
            metrosCuadrados = Double.parseDouble(br.readLine());
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }

        return metrosCuadrados;
    }

    private static double CostoTotal(double metrosCuadrados, double precioPorMetroCuadrado) {
        return metrosCuadrados * precioPorMetroCuadrado;
    }
}
