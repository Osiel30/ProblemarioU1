package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaTrece {

    public static void main() {
        double tasaDeCambio = 0.058;
        double cantidadEnPesos = CantidadEnPesos();

        double cantidadEnDolares = PesosADolares(cantidadEnPesos, tasaDeCambio);

        System.out.println("Con " + cantidadEnPesos + " pesos mexicanos, puedes adquirir $" + cantidadEnDolares + " dólares.");
    }

    private static double CantidadEnPesos() {
        double cantidad = 0.0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Ingrese la cantidad de pesos mexicanos: ");
            cantidad = Double.parseDouble(br.readLine());
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }

        return cantidad;
    }

    private static double PesosADolares(double cantidadEnPesos, double tasaDeCambio) {
        return cantidadEnPesos * tasaDeCambio;
    }
}

