package com.mycompany.subprocss;

import java.util.Scanner;

public class SubProcss {

public static void main(String[] args) {
        
        //  Limpiador de pantalla (Solo es un bucle que genera espacios en blanco 10 veces).
    
       for (int i = 0; i < 10; i++) {
           System.out.println("");
        }
       
    //  Lector de escritura.
    
        Scanner Edades = new Scanner(System.in);
            System.out.println("=======================");
            System.out.println("Enter your age: ");
            System.out.println("=======================");
            int edad = Edades.nextInt();
       
    //  Limpiador de pantalla (Solo es un bucle que genera espacios en blanco 10 veces).
            
       for (int i = 0; i < 10; i++) {
           System.out.println("");
        }
       
     // Detector de edades (Si es menor o igual a 17 años)
       
       if (edad <= 17) {
           System.out.println("=======================");
           System.out.println("Age: "+ edad);
           System.out.println("You are underage!");
           System.out.println("=======================");
           
     // Si no es ninguna de las anteriores
     
       } else {
           System.out.println("=======================");
           System.out.println("Age: "+ edad);
           System.out.println("You are of age!");
           System.out.println("=======================");
       }
}

    // Extra de la creacion de subproceso Loader.java

    void start() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
        