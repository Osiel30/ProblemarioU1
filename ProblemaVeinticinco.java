package edu.upvictoria.fpoo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaVeinticinco{
    public static void main() {
        int numeroDiasViaje = NumeroDiasViaje();

        double gastosHotelDiarios = GastosDiarios("hotel");
        double gastosComidaDiarios = GastosDiarios("comida");

        double montoCheque = MontoCheque(numeroDiasViaje, gastosHotelDiarios, gastosComidaDiarios);

        System.out.println("El monto del cheque para el viaje es de $" + montoCheque);
    }

    public static int NumeroDiasViaje() {
        int numeroDiasViaje = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Ingrese el número de días de viaje a Monterrey: ");
            numeroDiasViaje = Integer.parseInt(br.readLine());
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }

        return numeroDiasViaje;
    }

    public static double GastosDiarios(String tipoGasto) {
        double gastosDiarios = 0.0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Ingrese los gastos diarios de " + tipoGasto + ": $");
            gastosDiarios = Double.parseDouble(br.readLine());
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }

        return gastosDiarios;
    }

    public static double MontoCheque(int numeroDiasViaje, double gastosHotelDiarios, double gastosComidaDiarios) {
        double otrosGastosDiarios = 100.00;
        return (gastosHotelDiarios + gastosComidaDiarios + otrosGastosDiarios) * numeroDiasViaje;
    }
}

