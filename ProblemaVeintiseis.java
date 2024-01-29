package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaVeintiseis{

    public static void main() {
        double sueldoMensual = SueldoMensual();

        double ahorroSemanal = sueldoMensual * 0.15;
        double ahorroMensual = ahorroSemanal * 4;

        double ahorroAnual = ahorroMensual * 12;

        System.out.println("El ahorro anual es de $" + ahorroAnual);
    }

    public static double SueldoMensual() {
        double sueldoMensual = 0.0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Ingrese el sueldo mensual de la persona: $");
            sueldoMensual = Double.parseDouble(br.readLine());
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }

        return sueldoMensual;
    }
}

