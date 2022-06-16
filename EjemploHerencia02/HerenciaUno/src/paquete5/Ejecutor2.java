/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.util.Locale;
import java.util.Scanner;

public class Ejecutor2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        // Creación de un objeto de tipo EstudianteDistancia
        System.out.println("Ingrese nombres del estudiante: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese apellidos del estudiante: ");
        String apellido = sc.nextLine();
        System.out.println("Ingrese identificacion del estudiante: ");
        String identificacion = sc.nextLine();
        System.out.println("Ingrese edad del estudiante: ");
        int edad = sc.nextInt();
        System.out.println("Ingrese numero de creditos: ");
        int numCreditos = sc.nextInt();
        System.out.println("Ingrese el costo del credito: ");
        double costoCred = sc.nextFloat();
        
                
        EstudiantePresencial estPresencial = new EstudiantePresencial(nombre,
                apellido, identificacion, edad, numCreditos, costoCred);
        
        estPresencial.calcularMatriculaPresencial();
        
        System.out.println(estPresencial);
    }
}
