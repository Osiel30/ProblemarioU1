package edu.upvictoria.fpoo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaDos {
    public static void main() {
        try {
            Calificaciones calificaciones = new Calificaciones();
            float[] notas = calificaciones.obtenerCalificaciones();

            Promedio promedio = new Promedio();
            promedio.calcularPromedio(notas);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Calificaciones {
    public float[] obtenerCalificaciones() throws IOException {
        float[] notas = new float[4];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese las 4 calificaciones del periodo:");

        for (int i = 0; i < 4; i++) {
            System.out.print("Calificación " + (i + 1) + ": ");
            String input = br.readLine();

            try {
                notas[i] = Float.parseFloat(input);
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido.");
                i--; // Decrementamos i para volver a pedir la misma calificación
            }
        }

        return notas;
    }
}
