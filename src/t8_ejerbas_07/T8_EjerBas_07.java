/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t8_ejerbas_07;

/**
 *
 * @author alumno
 */import java.util.*;
public class T8_EjerBas_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Caja a, b;
        
        a = new Caja(100, 200, 200, Caja.Unidad.CM);
        a.etiqueta = "Antonio Pérez\nCalle Larga n 8";
        b = new Caja(1.2, 0.9, 1.45, Caja.Unidad.M);
        b.etiqueta = "Pepa Gonzalez. Entregar antes de las 10:00h";
        
        
        System.out.println(a);
         System.out.println("Volumen: " + a.getVolumen());
          System.out.println(b);
           System.out.println("Volumen: " + b.getVolumen());
    }
    
}
