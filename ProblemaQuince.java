package edu.upvictoria.fpoo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaQuince{

    public static void main() {
        double tarifaPorHora = 15.5;

        double horasEstacionamiento = HorasEstacionadas();

        double cobroTotal = Cobro(horasEstacionamiento, tarifaPorHora);

        System.out.println("El cobro por " + horasEstacionamiento + " horas de estacionamiento es: $" + cobroTotal);
    }

    private static double HorasEstacionadas() {
        double horas = 0.0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Ingrese la cantidad de horas de estacionamiento: ");
            horas = Double.parseDouble(br.readLine());
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
        return horas;
    }

    private static double Cobro(double horasEstacionadas, double tarifaPorHora) {
        int horasRedondeadas = (int) Math.ceil(horasEstacionadas);
        return horasRedondeadas * tarifaPorHora;
    }
}

