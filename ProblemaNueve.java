package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaNueve {
    public static void main() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Ingrese las horas trabajadas a la semana: ");
            double horasTrabajadas = Double.parseDouble(reader.readLine());

            System.out.print("Ingrese el pago por hora: ");
            double pagoPorHora = Double.parseDouble(reader.readLine());

            double sueldoSemanal = SueldoSemanal(horasTrabajadas, pagoPorHora);

            System.out.println("El sueldo semanal es: $" + sueldoSemanal);

        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

    private static double SueldoSemanal(double horasTrabajadas, double pagoPorHora) {

        final double horasRegulares = Math.min(horasTrabajadas, 40);
        final double horasExtras = Math.max(horasTrabajadas - 40, 0);

        double sueldoTotal = (horasRegulares * pagoPorHora) + (horasExtras * 1.5 * pagoPorHora);

        return sueldoTotal;
    }
}
