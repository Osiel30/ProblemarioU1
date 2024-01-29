package edu.upvictoria.fpoo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
public class ProblemaCatorce{

    public static void main() {
        int anoActual = Calendar.getInstance().get(Calendar.YEAR);
        int anoNacimiento = AnoNacimiento();
        int edad = calcularEdad(anoNacimiento, anoActual);

        System.out.println("Si naciste en el año " + anoNacimiento + ", tu edad es aproximadamente " + edad + " años.");
    }

    private static int AnoNacimiento() {
        int año = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Ingrese el año de nacimiento: ");
            año = Integer.parseInt(br.readLine());
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }

        return año;
    }

    private static int calcularEdad(int añoNacimiento, int añoActual) {
        return añoActual - añoNacimiento;
    }
}
