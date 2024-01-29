package edu.upvictoria.fpoo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaTres {
    public static void main() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Ingrese la longitud del rectángulo: ");
            double longitud = Double.parseDouble(reader.readLine());

            System.out.print("Ingrese el ancho del rectángulo: ");
            double ancho = Double.parseDouble(reader.readLine());
            double area = AreaRectangulo(longitud, ancho);

            System.out.println("El área del rectángulo es: " + area);

        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }
    public static double AreaRectangulo(double longitud, double ancho) {
        return longitud * ancho;
    }
}
