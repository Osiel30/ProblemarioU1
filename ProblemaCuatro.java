package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaCuatro{
    public static void main(String[] args) {
        try {
            double radio = Radio();
            double area = Circunferencia(radio);
            System.out.println("El área de la circunferencia con radio " + radio + " es: " + area);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static double Radio() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese el radio de la circunferencia:");

        try {
            String input = br.readLine();
            return Double.parseDouble(input);
        } catch (NumberFormatException e) {
            System.out.println("Por favor, ingrese un número válido.");
            return Radio();
        }
    }

    private static double Circunferencia(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }
}
