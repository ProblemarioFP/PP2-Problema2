/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema2;
import java.util.*;
/**
 *
 * @author Miguel
 */
public class PP2Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double dato; // Declracion de variables
    
    dato= pedirDato();  //Declaracion de metodos
    mostrarResultado(dato);
    
    }
    
    public static double pedirDato() { //Metodo para pedir dato por teclado
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introducir medida en metros para conversion");
        return entrada.nextDouble();
    }
    
    public static void mostrarResultado(double x) { //Metodo que realiza la conversión y muestra en pantalla el resultado
        
        double pies,yardas,millas;
        
        pies= x*3.28;
        yardas = x*1.09;
        millas = x*0.000621371;
        
        System.out.println(x+" metros es igual a: "+pies+" pies, "+yardas+" yardas, "+millas+" millas.");
    }
    
    
}
//