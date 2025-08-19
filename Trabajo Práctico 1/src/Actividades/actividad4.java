/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Actividades;

import java.util.Scanner;

/**
 *
 * @author fedeq
 */
public class actividad4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = input.nextLine();
        System.out.println("Ingrese su edad: ");
        int edad = input.nextInt();
        
        System.out.println("Nombre " + nombre);
        System.out.println("Edad " + edad);
    }
}
