package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaVeintidos {

    public static void main() {
        double kilowattsConsumidos = KilowattsConsumidos();
        double tarifaPorKilowattHora = TarifaPorKilowattHora();

        double pagoTotal = PagoTotal(kilowattsConsumidos, tarifaPorKilowattHora);

        System.out.println("El pago total por " + kilowattsConsumidos + " kilowatts es: $" + pagoTotal);
    }

    public static double KilowattsConsumidos() {
        double kilowatts = 0.0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Ingrese la cantidad de kilowatts consumidos: ");
            kilowatts = Double.parseDouble(br.readLine());
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }

        return kilowatts;
    }

    public static double TarifaPorKilowattHora() {
        double tarifaPorKilowattHora = 0.0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Ingrese la tarifa por kilowatt-hora de energía eléctrica: $");
            tarifaPorKilowattHora = Double.parseDouble(br.readLine());
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }

        return tarifaPorKilowattHora;
    }

    public static double PagoTotal(double kilowattsConsumidos, double tarifaPorKilowattHora) {
        return kilowattsConsumidos * tarifaPorKilowattHora;
    }
}

