/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package jdgc.clase_1910;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author usuariom
 */
public class Clase_1910 {

    public static void main(String[] args) {
        programRandom2();
    }

    public static void random() {
        //numeros entre 0-1
        System.out.println("MATH.RANDOM");
        double aleatorio = Math.random(); //siempre devuelve double
        System.out.print(aleatorio + " ");
        //numeros entre un intervalo a-b, siempre genera un numero por debajo del limite
        System.out.println("\nTHREAD LOCAL RANDOM");
        int aleatorio2 = ThreadLocalRandom.current().nextInt(1, 11); //enteros, double, float, short, etc. 
        System.out.print(aleatorio2 + " ");
    }

    public static void programRandom1() {
//Una fabrica crea materiales radioactivos, estos materiales se crean mientras la temperatura no alcance los 80º 
//y la radioactividad no supere los 7 pR, esta fabrica va a estar fabricando piezas y en cada iteracion genera una 
//pieza en las condiciones anteriormente indicadas y en cada iteracion hay que poner la temperatura, indice de radioactividad y 
//si se ha generado la pieza. Al final del todo quiero que me mostreis la ultima temperatura alcanzada, ultimo indice y
//cuantas piezas sehan fabricado. La temperatura se genera aleatoriamente entre 1 y 100 y puede tener decimales, el indice entre 1-10.
        double t = ThreadLocalRandom.current().nextDouble(1, 101);
        int pR = ThreadLocalRandom.current().nextInt(1, 11);
        byte piezas = 0;
        while (t < 100 && pR <= 7) {
            System.out.println("t = " + t + ", pR = " + pR);
            piezas++;
            System.out.println("Since the temperature is: " + t + "and the pR: " + pR + ", and the parts generated are: " + piezas);
            t = ThreadLocalRandom.current().nextDouble(1, 101);
            pR = ThreadLocalRandom.current().nextInt(1, 11);
        }
        System.out.println("Since the temperature is: " + t + "and the pR: " + pR + ", and the part has not been generated");
    }

    public static void programRandom2() {
        //Un sistema informatico permite un maximo de 5 intentos de acceso. En cada intento se genera aleaatoriamente un numero entero entre 1-10.
        //Se considera que el acceso es permitido en el 7
        //desarrolla un programa con DO WHILE que simule los intentos hasta que se consiga acceder o agotar los ingresos permitidos
        //al terminar indica si se ha conseguido el acceso y cuantos intentos se han usado
        int access = 0;
        int tries = 0;

        do {
            access = ThreadLocalRandom.current().nextInt(1, 11);
            System.out.println("Your access try have a value: " + access);
            tries++;
            
        } while (access != 7 && tries < 5);
        
        if (access == 7) {
            System.out.println("Approved Access");
        } else {
            System.out.println("Denied Access");
        }
    }
    //Se genera con una probabilidad de 50% chupetes, con una del 20% cunas. En la fabrica se generan cosas hasta 100 chupetes y 50 cunas. Contar el numero de vueltas que ha dao el puro bucle.
}
