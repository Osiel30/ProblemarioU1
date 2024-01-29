package edu.upvictoria.fpoo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaVeinte {

    public static void main() {
        double duracionLlamadaMinutos = DuracionLlamada();
        double costoPorMinuto = CostoPorMinuto();

        double costoTotalLlamada = calcularCostoLlamada(duracionLlamadaMinutos, costoPorMinuto);

        System.out.println("El costo de la llamada telefónica es de $" + costoTotalLlamada);
    }

    public static double DuracionLlamada() {
        double duracion = 0.0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Ingrese la duración de la llamada en minutos: ");
            duracion = Double.parseDouble(br.readLine());
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }

        return duracion;
    }

    public static double CostoPorMinuto() {
        double costoPorMinuto = 0.0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Ingrese el costo por minuto de la llamada: $");
            costoPorMinuto = Double.parseDouble(br.readLine());
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }

        return costoPorMinuto;
    }

    public static double calcularCostoLlamada(double duracionLlamadaMinutos, double costoPorMinuto) {
        return duracionLlamadaMinutos * costoPorMinuto;
    }
}

