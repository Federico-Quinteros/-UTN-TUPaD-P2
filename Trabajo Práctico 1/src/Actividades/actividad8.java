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
public class actividad8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el primer número entero:");
        int primerNumero = input.nextInt();
        System.out.println("Ingrese el primer número entero:");
        int segundoNumero = input.nextInt();      
        int divisionInt;
        double divisionDouble;
        divisionInt = primerNumero / segundoNumero;
        divisionDouble = (double) primerNumero / segundoNumero;
        System.out.println("Resultado entero: " +  divisionInt);
        System.out.println("Resultado real: " +  divisionDouble);
        input.close();
     
       
    }
    
}
