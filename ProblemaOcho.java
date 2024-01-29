package edu.upvictoria.fpoo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaOcho {
    public static void main() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Ingrese la coordenada x del primer punto: ");
            double x1 = Double.parseDouble(reader.readLine());
            System.out.print("Ingrese la coordenada y del primer punto: ");
            double y1 = Double.parseDouble(reader.readLine());

            System.out.print("Ingrese la coordenada x del segundo punto: ");
            double x2 = Double.parseDouble(reader.readLine());
            System.out.print("Ingrese la coordenada y del segundo punto: ");
            double y2 = Double.parseDouble(reader.readLine());

            double distancia = Distancia(x1, y1, x2, y2);

            System.out.println("La distancia entre los dos puntos es: " + distancia);

        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

    private static double Distancia(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}

