package edu.upvictoria.fpoo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaVeintiuno {

    public static void main() {
        double metrosCubicosConsumidos = MetrosCubicos();
        double tarifaPorMetroCubico = TarifaPorMetroCubico();

        double pagoTotal = PagoTotal(metrosCubicosConsumidos, tarifaPorMetroCubico);

        System.out.println("El pago total por " + metrosCubicosConsumidos + " metros cúbicos es: $" + pagoTotal);
    }

    public static double MetrosCubicos() {
        double metrosCubicos = 0.0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Ingrese la cantidad de metros cúbicos consumidos: ");
            metrosCubicos = Double.parseDouble(br.readLine());
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }

        return metrosCubicos;
    }

    public static double TarifaPorMetroCubico() {
        double tarifaPorMetroCubico = 0.0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Ingrese la tarifa por metro cúbico de agua: $");
            tarifaPorMetroCubico = Double.parseDouble(br.readLine());
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }

        return tarifaPorMetroCubico;
    }

    public static double PagoTotal(double metrosCubicosConsumidos, double tarifaPorMetroCubico) {
        return metrosCubicosConsumidos * tarifaPorMetroCubico;
    }
}

