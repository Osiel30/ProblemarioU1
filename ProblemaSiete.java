package edu.upvictoria.fpoo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ProblemaSiete {
    public static void main() {
    }

    public class LitrosAGalones {
        public static void main(String[] args) {
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

                System.out.print("Ingrese la cantidad de litros de leche: ");
                double litros = Double.parseDouble(reader.readLine());
                double galones = litros / 3.78541;
                System.out.println("Equivalente en galones: " + galones);

            } catch (IOException | NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }

}
