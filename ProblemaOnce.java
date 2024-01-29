package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaOnce {

    public static void main() {
        double MetroCubico = 5.0;
        double metrosCubicosConsumidos = MetrosCubicos();

        double pagoT = calcularPagoTotal(metrosCubicosConsumidos, MetroCubico);

        System.out.println("El pago total por " + metrosCubicosConsumidos + " metros cúbicos es: $" + pagoT);
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

    public static double calcularPagoTotal(double metrosCubicos, double costoPorMetroCubico) {
        return metrosCubicos * costoPorMetroCubico;
    }
}

