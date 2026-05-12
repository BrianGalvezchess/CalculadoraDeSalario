package com.example.poo;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        CalculadoraModular Calculadora = new CalculadoraModular();
        Scanner sc = new Scanner(System.in);

        // 2. Pedir los datos al usuario
        System.out.print("Introduce el primer número: ");
        double a = sc.nextDouble();
        System.out.print("Introduce el segundo número: ");
        double b = sc.nextDouble();

        // Llamar a los métodos a través del objeto y mostrar resultados
        System.out.println("\n---resultados--");

        System.out.println("Suma: " + Calculadora.sumar(a,b));
        System.out.println("Resta: " + Calculadora.restar(a,b));
        System.out.println("Multiplicación: " + Calculadora.multiplicar(a,b));

        // Validación de división
        if (b != 0) {
            double Dividir = Calculadora.dividir(a,b);
            System.out.println("División: " + Dividir);
        } else {
            System.out.println("División: Error, no es divisible entre cero.");
        }
    }
}
