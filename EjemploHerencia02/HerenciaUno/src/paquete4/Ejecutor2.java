/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

public class Ejecutor2 {

    public static void main(String[] args) {

        // Creación de un objeto de tipo EstudianteDistancia
        String nombre = "Jelipe";
        String apellido = "El pirata";
        String identificacion = "110011";
        int edad = 25;
        
        EstudiantePresencial estPresencial = new EstudiantePresencial(nombre,
                apellido, identificacion, edad);
        
        estPresencial.establecerNumeroCreditos(15);
        estPresencial.establecerCostoCredito(158.99);
        estPresencial.calcularMatriculaPresencial();
        
        System.out.println(estPresencial);
    }
}
