/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete8;

public class Ejecutor2 {

    public static void main(String[] args) {

        // Creación de un objeto de tipo EstudianteDistancia
        String nombre = "Jelipe";
        String apellido = "El pirata";
        String identificacion = "110011";
        int edad = 36;
        int numCreditos = 5;
        double costoCredito = 50.5;
        EstudiantePresencial estPresencial = new EstudiantePresencial(nombre,
                apellido, identificacion, edad, numCreditos, costoCredito);
        
        estPresencial.establecerNombresEstudiante(nombre);
        
        System.out.println(estPresencial);
    }
}
