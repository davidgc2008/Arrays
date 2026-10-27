/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package jdgc.ejercicios_arrays_moodle;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author usuariom
 */
public class Ejercicios_Arrays_Moodle {
    static Scanner keyboard = new Scanner (System.in);

    public static void main(String[] args) {
        ejercicioUno();
    }

    public static void ejercicioUno() {
        String[] mochila = {"Linterna", "Galletas", "Mapa", "Botella de agua", "Cuerda"
        };
        System.out.println(mochila[0] + " y " + mochila[4]);

        mochila[1] = "Botiquin";
        System.out.println(Arrays.toString(mochila));
        
        System.out.println("Introduce un numero");
        int numero = keyboard.nextInt();
        
        if (numero <= 4){
            System.out.println(mochila[numero]);
        }else{
            System.out.println("No existe ese espacio");
        }
        
        System.out.println("Sustituye la posicion a sustituir");
        int numero2 =  keyboard.nextByte();
        
        System.out.println("Introduce el objeto");
        String cambio = keyboard.nextLine();
        
        mochila[numero2] = cambio;
        
        System.out.println(Arrays.toString(mochila));
    }
}
