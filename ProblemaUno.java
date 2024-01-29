package edu.upvictoria.fpoo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaUno {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    Number a, b;

    public ProblemaUno() {

    }

    public static void main() throws IOException {
        ProblemaUno numeros = new ProblemaUno();
        numeros.obtenerNumeros();

        System.out.println("Primer número ingresado: " + numeros.a);
        System.out.println("Segundo número ingresado: " + numeros.b);
        Suma calculadora = new Suma();
        calculadora.realizarSuma(numeros.a, numeros.b);

    }
    public ProblemaUno(Number a, Number b) {
        this.a = a;
        this.b = b;
    }

    public void obtenerNumeros() {
        while (true) {
            try {
                System.out.print("Ingrese el primer número: ");
                String entradaA = reader.readLine();

                System.out.print("Ingrese el segundo número: ");
                String entradaB = reader.readLine();

                if (esNumeroValido(entradaA) && esNumeroValido(entradaB)) {
                    a = convertirNumero(entradaA);
                    b = convertirNumero(entradaB);
                    break;
                } else {
                    System.out.println("Por favor, ingrese números válidos (int, double o float). Inténtelo de nuevo.");
                }
            } catch (IOException e) {
                System.out.println("Error de entrada/salida. Inténtelo de nuevo.");
            }
        }
    }

    public boolean esNumeroValido(String entrada) {
        try {
            Integer.parseInt(entrada);
            return true;
        } catch (NumberFormatException e1) {
            try {
                Float.parseFloat(entrada);
                return true;
            } catch (NumberFormatException e2) {
                try {
                    Double.parseDouble(entrada);
                    return true;
                } catch (NumberFormatException e3) {
                    return false;
                }
            }
        }
    }

    public Number convertirNumero(String entrada) {
        try {
            return Integer.parseInt(entrada);
        } catch (NumberFormatException e1) {
            try {
                return Float.parseFloat(entrada);
            } catch (NumberFormatException e2) {
                return Double.parseDouble(entrada);
            }
        }
    }
}
