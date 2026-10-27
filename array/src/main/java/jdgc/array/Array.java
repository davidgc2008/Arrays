/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package jdgc.array;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author usuariom
 */
public class Array {

    public static void main(String[] args) {
        arrays1();
    }
    
    public static void arrays1(){
        //definimos un array de 5 edades
        int[] edades = new int[5];
        
        //Lo rellenamos
        //1º forma (lenta)
       /* edades[0] = 2;
        edades[1] = 6;*/
        
        //2º forma (Intermedia)
       // int[] edades2 = {2, 6, 20, 30, 45};
        
        //3º forma (Otra  intermedia, no se usa casi nunca)
        //Recorriendo en  array
        for (int i = 0; i < edades.length; i++) {
            edades[i]= ThreadLocalRandom.current().nextInt(0,121);
            
        }
        /*
        //Mostrar un array
        //Lo recorremos con un for
        for (int i = 0; i < edades.length; i++) {
            System.out.println(edades[i]);          
        }
        //Recorrer con while
        System.out.println("While");
        int i = 0;
        while(i < edades.length){
            System.out.println(edades[i]);
             i++;
        }
*/
        for (int edades3 : edades) {
            System.out.println(edades3);          
        }
    }
}
