package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaVeintitres{

    public static void main() {
        double precioOriginal = PrecioOriginal();

        double precioConDescuento = PrecioConDescuento(precioOriginal, 0.20); // Descuento del 20%

        double precioFinal = PrecioFinal(precioConDescuento, 0.15); // IVA del 15%

        System.out.println("Precio con descuento: $" + precioConDescuento);
        System.out.println("Precio final (con IVA): $" + precioFinal);
    }

    public static double PrecioOriginal() {
        double precioOriginal = 0.0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Ingrese el precio original del artículo: $");
            precioOriginal = Double.parseDouble(br.readLine());
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }

        return precioOriginal;
    }

    public static double PrecioConDescuento(double precioOriginal, double porcentajeDescuento) {
        return precioOriginal * (1 - porcentajeDescuento);
    }

    public static double PrecioFinal(double precioConDescuento, double porcentajeIVA) {
        return precioConDescuento * (1 + porcentajeIVA);
    }
}

