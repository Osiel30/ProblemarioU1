package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaDieciocho{

    public static void main() {
        double distanciaKilometros = Distancia();
        double costoPorKilometro = CostoPorKilometro();

        double costoBoleto = calcularCostoBoleto(distanciaKilometros, costoPorKilometro);

        System.out.println("El costo del boleto para un viaje de " + distanciaKilometros + " km es: $" + costoBoleto);
    }

    public static double Distancia() {
        double distancia = 0.0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Ingrese la distancia del viaje en kilómetros: ");
            distancia = Double.parseDouble(br.readLine());
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }

        return distancia;
    }

    public static double CostoPorKilometro() {
        double costoPorKilometro = 0.0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Ingrese el costo por kilómetro: $");
            costoPorKilometro = Double.parseDouble(br.readLine());
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }

        return costoPorKilometro;
    }

    public static double calcularCostoBoleto(double distanciaKilometros, double costoPorKilometro) {
        return distanciaKilometros * costoPorKilometro;
    }
}

