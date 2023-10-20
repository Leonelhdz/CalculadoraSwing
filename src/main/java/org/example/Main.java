package org.example;

/**
 * Clase principal que contiene el método principal (main) del programa.
 */
public class Main {
    /**
     * Método principal del programa. Inicia la aplicación y muestra la ventana de la calculadora.
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan en este programa).
     */
    public static void main(String[] args) {
        System.out.println("Bienvenido al Programa Calculadora con Swing");

        // Crea una instancia de VentanaCalculadora y carga la ventana de la calculadora.
        (new VentanaCalculadora()).load();
    }
}