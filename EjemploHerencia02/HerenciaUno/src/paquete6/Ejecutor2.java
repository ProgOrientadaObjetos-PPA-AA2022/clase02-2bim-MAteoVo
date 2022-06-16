/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete6;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALA I
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        String estudiantes ="";
        int op;
        do {            
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
            estudiantes = String.format("%s%s",estudiantes,estPresencial);
            System.out.println("Desea ingresar otro estudiante  ??");
            System.out.println("SI                              [1]:");
            System.out.println("NO                              [0]:");
            op=sc.nextInt();
            sc.nextLine();
        } while (op!=0);
        System.out.printf("%s",estudiantes);
    }
}
