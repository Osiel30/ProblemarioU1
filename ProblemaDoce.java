package edu.upvictoria.fpoo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaDoce {

    public static void main() {
        double base = obtenerDimension("base");
        double altura = obtenerDimension("altura");

        double area = AreaTriangulo(base, altura);
        System.out.println("El área del triángulo con base " + base + " y altura " + altura + " es: " + area);
    }

    private static double obtenerDimension(String dimension) {
        double valor = 0.0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Ingrese la " + dimension + " del triángulo: ");
            valor = Double.parseDouble(br.readLine());
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }

        return valor;
    }

    private static double AreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }
}
