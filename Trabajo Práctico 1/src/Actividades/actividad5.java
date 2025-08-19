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
public class actividad5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese el primer número entero:");
        int primerNumero = input.nextInt();
        System.out.println("Ingrese el primer número entero:");
        int segundoNumero = input.nextInt();      
        int suma, resta, multiplicacion;
        double division;
        suma = primerNumero + segundoNumero;
        resta = primerNumero - segundoNumero;
        multiplicacion = primerNumero * segundoNumero;
        division = primerNumero / segundoNumero;
        System.out.println(primerNumero + " + " + segundoNumero + " es igual a: " + suma);
        System.out.println(primerNumero + " - " + segundoNumero + " es igual a: " + resta);
        System.out.println(primerNumero + " * " + segundoNumero + " es igual a: " + multiplicacion);
        System.out.println(primerNumero + " / " + segundoNumero + " es igual a: " + division);
    }
    
}
