package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaSeis {
    public static void main() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


            System.out.print("Ingrese la longitud de la hipotenusa: ");
            double h = Double.parseDouble(reader.readLine());

            System.out.print("Ingrese la longitud del radio: ");
            double r = Double.parseDouble(reader.readLine());

            double areaTriangulo = AreaTR(h, r);
            double areaSemicircunferencia = AreaSemicircunferencia(r);
            double areaTotal = areaTriangulo * 2 + areaSemicircunferencia;
            System.out.println("El área total de la figura es: " + areaTotal);

        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public static double AreaTR(double hipotenusa, double cateto) {
        return 0.5 * hipotenusa * cateto;
    }


    public static double AreaSemicircunferencia(double radio) {
        return 0.5 * Math.PI * Math.pow(radio, 2);
    }
}
