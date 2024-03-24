/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecema1;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Proyecema1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
/ Superclase Carro
public class Carro {
    // Atributos y métodos comunes para un carro
}

// Superclase Avion
public class Avion {
    // Atributos y métodos comunes para un avión
}

// Superclase Barco
public class Barco {
    // Atributos y métodos comunes para un barco
}
import java.util.Scanner;

public class MenuPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menu Principal");
            System.out.println("1. Ver opciones de Carro");
            System.out.println("2. Ver opciones de Avion");
            System.out.println("3. Ver opciones de Barco");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> mostrarMenuCarro();
                case 2 -> mostrarMenuAvion();
                case 3 -> mostrarMenuBarco();
                case 4 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 4);
    }

    public static void mostrarMenuCarro() {
        // Aquí puedes agregar opciones específicas para el carro
        System.out.println("Opciones de Carro:");
        System.out.println("1. Crear un nuevo carro");
        System.out.println("2. Mostrar información de un carro existente");
        // Agrega más opciones si es necesario
    }

    public static void mostrarMenuAvion() {
        // Aquí puedes agregar opciones específicas para el avión
        System.out.println("Opciones de Avion:");
        System.out.println("1. Crear un nuevo avion");
        System.out.println("2. Mostrar información de un avion existente");
        // Agrega más opciones si es necesario
    }

    public static void mostrarMenuBarco() {
        // Aquí puedes agregar opciones específicas para el barco
        System.out.println("Opciones de Barco:");
        System.out.println("1. Crear un nuevo barco");
        System.out.println("2. Mostrar información de un barco existente");
        // Agrega más opciones si es necesario
    }
}