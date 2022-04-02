/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO_PRACTICO6;

import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author Armando
 */
public class main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        FormatoFecha f = new FormatoFecha();
    
        System.out.println("Ingrese fecha sin caracteres: ");
        f.setFecha(sc.nextLine());
        
        f.imprimirConguiones();
        
    }
    
    
}
