/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package jdgc.arrayej1;

import java.util.Arrays;

/**
 *
 * @author usuariom
 */
public class Arrayej1 {

    public static void main(String[] args) {
        ej2();
    }

    public static void arraysAyuda() {
        int[] original = {30, 8, 2};
        int[] ordenado = new int[original.length];
        int posicion = 0;
        for (int pos = 0; pos < original.length; pos++) {
            int minimo = original[0];
            //determina el minimo en cada vuelta
            for (int i = 1; i < original.length; i++) {
                if (original[i] < minimo) {
                    minimo = original[i];
                    posicion = i;
                }
            }
            //cuando ya tengo el minimo de cada vuelta
            ordenado[pos] = minimo;
            original[posicion] = Integer.MAX_VALUE;
            System.out.println("El minimo es: " + minimo + " y la posicion es: " + posicion);
            System.out.println(Arrays.toString(original));
        }
        System.out.println(Arrays.toString(ordenado));
    }

    public static void ej2() {
        //Nuevo ej
        //Ordenar de mayor a menor pero en el mismo array
        int[] arrayPrimero = {2, 29, 50};
        int posicion2 = 0;
        for (int pos = 0; pos < arrayPrimero.length; pos++) {
            int minimo = arrayPrimero[0];
            for (int i = 1; i < arrayPrimero.length; i++) {
                if (arrayPrimero[i] < minimo) {
                    minimo = arrayPrimero[i];
                    posicion2 = i;
                }
            }
            arrayPrimero[pos] = minimo;
            arrayPrimero[posicion2] = Integer.MAX_VALUE;
            System.out.println("El minimo es: " + minimo + " y la posicion es: " + posicion2);
            System.out.println(Arrays.toString(arrayPrimero));
        }
        System.out.println(Arrays.toString(arrayPrimero));
        }
    }

