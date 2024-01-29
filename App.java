package edu.upvictoria.fpoo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class App 
{
    public static void main( String[] args ) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int opcion=0;
        int opcionDos=0;
        do{
            MenuPrincipal();
            System.out.println("Elige el Programario que desees ejecutar: ");
            try{
                opcion=Integer.parseInt(reader.readLine());
            }catch(NumberFormatException e){
                System.out.println("Ingresa un numero valido ");
                continue;
            } catch (IOException e) {
                System.out.println("Ocurrio un error...Cerrando el programa ");
                break;
            }

            switch (opcion){
                case 0:
                    System.out.print("Cerrando el programa...");
                    System.exit(0);
                    break;
                case 1:
                    MenuUno();
                    System.out.println("Elige el Programa que deseas ejecutar: ");
                    try{
                        opcionDos=Integer.parseInt(reader.readLine());
                    }catch(NumberFormatException e){
                        System.out.println("Ingresa un numero valido ");
                        continue;
                    } catch (IOException e) {
                        System.out.println("Ocurrio un error...Cerrando el programa ");
                        break;
                    }
                    do{
                        switch (opcionDos){
                            case 0:
                                System.out.print("Cerrando el programa...");
                                System.exit(0);
                                break;
                            case 1:
                                System.out.println("Programa 1.- SUMA DE DOS NUMEROS: ");
                                ProblemaUno sum = new ProblemaUno();
                                ProblemaUno.main();
                                break;
                            case 2:
                                System.out.println("Programa 2.- PROMEDIO DE 4 CALIFICACIONES: ");
                                ProblemaDos  prom= new ProblemaDos();
                                ProblemaDos.main();
                                break;
                            case 3:
                                System.out.println("Programa 3.- CALCULO DE AREA DEL RECTANGULO: ");
                                ProblemaTres rect= new ProblemaTres();
                                ProblemaTres.main();
                                break;
                            case 4:
                                System.out.println("Programa 4.- CALCULO DE CIRCUNFERENCIA: ");
                                ProblemaCuatro Circ= new ProblemaCuatro();
                                ProblemaTres.main();
                                break;
                            case 5:
                                System.out.println("Programa 5.- PROMEDIO DE 4 CALIFICACIONES: ");

                                break;
                            case 6:
                                System.out.println("Programa 6.- AREA DE UN TRIANGULO: ");
                                ProblemaSeis Tri= new ProblemaSeis();
                                ProblemaSeis.main();
                                break;
                            case 7:
                                System.out.println("Programa 7.- LITROS A GALONES: ");
                                ProblemaSiete Lit= new ProblemaSiete();
                                ProblemaSiete.main();
                                break;
                            case 8:
                                System.out.println("Programa 8.- DISTANCIA ENTRE DOS PUNTOS: ");
                                ProblemaOcho Dist= new ProblemaOcho();
                                ProblemaOcho.main();
                                break;
                            case 9:
                                System.out.println("Programa 9.- SUELDO POR HORA: ");
                                ProblemaNueve Sueldo= new ProblemaNueve();
                                ProblemaNueve.main();
                                break;
                            case 10:
                                System.out.println("Programa 10.- PULGADAS A METROS: ");
                                ProblemaDiez Pulg= new ProblemaDiez();
                                ProblemaDiez.main();
                                break;
                            case 11:
                                System.out.println("Programa 11.- PAGO POR METRO CUBICO: ");
                                ProblemaOnce PxM= new ProblemaOnce();
                                ProblemaOnce.main();
                                break;
                            case 12:
                                System.out.println("Programa 12.- AREA DE TRIANGULO RECTANGULO: ");
                                ProblemaDoce Atr= new ProblemaDoce();
                                ProblemaDoce.main();
                                break;
                            case 13:
                                System.out.println("Programa 13.- PESOS A DOLARES: ");
                                ProblemaTrece PaD= new ProblemaTrece();
                                ProblemaTrece.main();
                                break;
                            case 14:
                                System.out.println("Programa 14.- CALCULO DE AÑO DE NACIMIENTO: ");
                                ProblemaCatorce AnodeN= new ProblemaCatorce();
                                ProblemaCatorce.main();
                                break;
                            case 15:
                                System.out.println("Programa 15.- HORAS ESTACIONADAS: ");
                                ProblemaQuince Horas= new ProblemaQuince();
                                ProblemaQuince.main();
                                break;
                            case 16:
                                System.out.println("Programa 16.- PINTAR METROS CUADRADOS: ");
                                ProblemaDieciseis Pintar= new ProblemaDieciseis();
                                ProblemaDieciseis.main();
                                break;
                            case 17:
                                System.out.println("Programa 17.- HIPOTENUSA DE TRIANGULO RECTANGULO: ");
                                ProblemaDiecisiete Hip= new ProblemaDiecisiete();
                                ProblemaDiecisiete.main();
                                break;
                            case 18:
                                System.out.println("Programa 18.- BOLETOS DE VIAJE: ");
                                ProblemaDieciocho Boleto= new ProblemaDieciocho();
                                ProblemaDieciocho.main();
                                break;
                            case 19:
                                System.out.println("Programa 19.- TIEMPO DE VIAJE EN BICICLETA POR KM : ");
                                ProblemaDiecinueve P= new ProblemaDiecinueve();
                                ProblemaDiecinueve.main();
                                break;
                            case 20:
                                System.out.println("Programa 20.- CALCULO DE COSTO DE LLAMADA POR MINUTO: ");
                                ProblemaVeinte Llamada= new ProblemaVeinte();
                                ProblemaVeinte.main();
                                break;
                            case 21:
                                System.out.println("Programa 21.- CALCULO DE CONSUMO DE AGUA: ");
                                ProblemaVeintiuno Agua= new ProblemaVeintiuno();
                                ProblemaVeintiuno.main();
                                break;
                            case 22:
                                System.out.println("Programa 22.- CALCULO DE CONSUMO DE ENERGIA: ");
                                ProblemaVeintidos Luz= new ProblemaVeintidos();
                                ProblemaVeintidos.main();
                                break;
                            case 23:
                                System.out.println("Programa 23.-   PRECIO DE PRODUCTO DESCUENTO/IVA: ");
                                ProblemaVeintitres Descuento= new ProblemaVeintitres();
                                ProblemaVeintitres.main();
                                break;
                            case 24:
                                System.out.println("Programa 24.- CALCULO DE AHORRO ANUAL: ");
                                ProblemaVeinticuatro Ahorro= new ProblemaVeinticuatro();
                                ProblemaVeinticuatro.main();
                                break;
                            case 25:
                                System.out.println("Programa 25.- VIATICOS: ");
                                ProblemaVeinticinco Via= new ProblemaVeinticinco();
                                ProblemaVeinticinco.main();
                                break;
                            case 26:
                                System.out.println("Programa 26.- VIATICOS II: ");
                                ProblemaVeintiseis Viaticos= new ProblemaVeintiseis();
                                ProblemaVeintiseis.main();
                                break;


                        }
                        System.out.println("Digita el numero correspondiente al programa que desees ejecutar...      ");
                        System.out.println("Si quieres salir digita cero:          ");
                        try {
                            opcionDos = Integer.parseInt(reader.readLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Ingresa un numero valido ");
                            continue;
                        } catch (IOException e) {
                            System.out.println("Ocurrio un error...Cerrando el programa ");
                            break;
                        }

                    }while (opcionDos != 0);



            }
        }while(opcion !=0);
        reader.close();

    }
    private static void MenuPrincipal(){
        System.out.print("      MENU DEL PROGRAMA      ");
        System.out.print("0) Salir");
        System.out.print("1) Programario 1 ");
    }
    private static void MenuUno(){
        System.out.print("      MENU DEL PROGRAMARIO      ");
        System.out.println("1) Problema 1.- SUMA DE NUMEROS");
        System.out.println("2) Problema 2.- PROMEDIO DE 4 CALIFICACIONES");
        System.out.println("3) Problema 3.- CALCULO DE AREA DEL RECTANGULO");
        System.out.println("4) Problema 4.- CALCULO DE CIRCUNFERENCIA");
        System.out.println("5) Problema 5.- Promedio de 4 Calificaciones");
        System.out.println("6) Problema 6.-  AREA DE UN TRIANGULO");
        System.out.println("7) Problema 7.- LITROS A GALONES");
        System.out.println("8) Problema 8.- DISTANCIA ENTRE DOS PUNTOS");
        System.out.println("9) Problema 9.- Promedio de 4 Calificaciones");
        System.out.println("10) Problema 10.- SUELDO POR HORA");
        System.out.println("11) Problema 11.- PAGO POR METRO CUBICO");
        System.out.println("12) Problema 12.- AREA DE TRIANGULO RECTANGULO");
        System.out.println("13) Problema 13.- PESOS A DOLARES");
        System.out.println("14) Problema 14.- CALCULO DE AÑO DE NACIMIENTO");
        System.out.println("15) Problema 15.- HORAS ESTACIONADAS");
        System.out.println("16) Problema 16.- PINTAR METROS CUADRADOS");
        System.out.println("17) Problema 17.- HIPOTENUSA DE TRIANGULO RECTANGULO");
        System.out.println("18) Problema 18.- BOLETOS DE VIAJE");
        System.out.println("19) Problema 19.-TIEMPO DE VIAJE EN BICICLETA POR KM");
        System.out.println("20) Problema 20.- CALCULO DE COSTO DE LLAMADA POR MINUTO");
        System.out.println("21) Problema 21.- CALCULO DE CONSUMO DE AGUA");
        System.out.println("22) Problema 22.- CALCULO DE CONSUMO DE ENERGIA");
        System.out.println("23) Problema 23.- PRECIO DE PRODUCTO DESCUENTO/IVA");
        System.out.println("24) Problema 24.- CALCULO DE AHORRO ANUAL");
        System.out.println("25) Problema 25.- VIATICOS");
        System.out.println("26) Problema 26.- VIATICOS II");
    }
}
