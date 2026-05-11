package com.example.poo;

import java.util.Scanner;

public class CalculadoraSalario {
public static void main(String [] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("ingresa el nombre del empleado: ");
    String empleado = sc.nextLine();

    System.out.println("ingresa las horas trabajadas: ");
    double horasTrabajadas = sc.nextDouble();

    System.out.println("Ingresa el pago por hora: ");
    double pagoPorHora = sc.nextDouble();

    //calculamos el salario bruto
    double salarioBruto = horasTrabajadas * pagoPorHora;

    double isr = salarioBruto * 0.10;

    double salarioFinal = salarioBruto - isr;

    System.out.println("Empleado : " + empleado);
    System.out.println("Salario Bruto:" + salarioBruto);
    System.out.println("ISR(10%)" + isr);
    System.out.println("Salario Final:" + salarioFinal);

    if (salarioFinal > 12000){
        System.out.println("Empleado con ingresos altos");
    }
   }
}
