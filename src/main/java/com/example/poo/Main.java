package com.example.poo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //instanciar la clase scanner
        //objeto
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu nombre:");
        //en esta sentencia abrimos una variable que ingrese los datos del usuario y ocupamos el metodo
        //netxLine para leer cadenas en consola
        String nombre = sc.nextLine();

        System.out.print("Ingresa tu carrera: ");
        String carrera = sc.nextLine();

        System.out.println("Escribe primera calificacion:");
        int calificacion1 = sc.nextInt();

        System.out.println("Escribe segunda calificacion:");
        int calificacion2 = sc.nextInt();

        System.out.println("Escribe tercera calificacion:");
        int calificacion3 = sc.nextInt();

        //calcular promedio

        int promedio = (calificacion1+ calificacion2+  calificacion3) / 3;

        System.out.println(nombre);
        System.out.println("Tu nombre es :" + nombre);
        System.out.println(carrera);
        System.out.println("Tu carrera es : " + carrera);
        System.out.println(promedio);
        System.out.println("su promedio es: " + promedio);


        if (promedio < 7){
            System.out.println("La calificacion es reprobatorio");
        }else {
            System.out.println("aprobado, calif:" + promedio);
            }

        if (promedio == 10) {
            System.out.println("La calificacion es excelente (alumno de excelencia)" + promedio);
        }

        }
    }