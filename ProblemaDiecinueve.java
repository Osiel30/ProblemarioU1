package edu.upvictoria.fpoo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaDiecinueve {

    public static void main() {
        double distanciaKilometros = Distancia();
        double velocidadKilometrosPorHora = Velocidad();

        double tiempoV = TiempoViaje(distanciaKilometros, velocidadKilometrosPorHora);

        System.out.println("El tiempo de viaje en bicicleta es de aproximadamente " + tiempoV + " horas.");
    }

    public static double Distancia() {
        double distancia = 0.0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Ingrese la distancia entre las ciudades en kilómetros: ");
            distancia = Double.parseDouble(br.readLine());
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }

        return distancia;
    }

    public static double Velocidad() {
        double velocidad = 0.0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Ingrese la velocidad en bicicleta en km/h: ");
            velocidad = Double.parseDouble(br.readLine());
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }

        return velocidad;
    }

    public static double TiempoViaje(double distanciaKilometros, double velocidadKilometrosPorHora) {
        return distanciaKilometros / velocidadKilometrosPorHora;
    }
}
