package edu.upvictoria.fpoo;
class Promedio {
    public void calcularPromedio(float[] notas) {
        float suma = 0;

        // Sumamos todas las calificaciones
        for (float nota : notas) {
            suma += nota;
        }

        // Calculamos y mostramos el promedio
        float promedio = suma / notas.length;
        System.out.println("El promedio de las calificaciones es: " + promedio);
    }
}