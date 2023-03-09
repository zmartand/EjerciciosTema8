package Ejercicio1;

import Ejercicio1.JugadorGuerra;

import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Nombre del jugador?");
        String nombre1 = sc.nextLine();
        System.out.println("¿Nombre del jugador?");
        String nombre2 = sc.nextLine();
        JugadorGuerra jugador1 = new JugadorGuerra(nombre1);
        JugadorGuerra jugador2 = new JugadorGuerra(nombre2);
        int marcador1 = 10;
        int marcador2 = 10;
        while (marcador1 > 0 && marcador2 > 0) {
            int dado1 = jugador1.tirarDado();
            int dado2 = jugador2.tirarDado();
            System.out.println(jugador1.getNombre() + " ha sacado un " + dado1);
            System.out.println(jugador2.getNombre() + " ha sacado un " + dado2);
            if (dado1 > dado2) {
                marcador1++;
                marcador2--;
                System.out.println(jugador1.getNombre() + " gana");
            } else if (dado1 < dado2) {
                marcador1--;
                marcador2++;
                System.out.println(jugador2.getNombre() + " gana");
            } else {
                System.out.println("empate");
            }
            System.out.println("Marcador: " + jugador1.getNombre() + " " + marcador1 + " - " + jugador2.getNombre() + " " + marcador2);
        }
        if (marcador1 > marcador2) {
            System.out.println(jugador1.getNombre() + " ha ganado");
        } else {
            System.out.println(jugador2.getNombre() + " ha ganado");
        }
    }

}
