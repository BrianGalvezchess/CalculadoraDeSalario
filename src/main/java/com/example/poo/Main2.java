package com.example.poo;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        //instancia de la clase
        //crear un objeto a partir de la clase

        ClaseEjemplo claseEjemplo = new ClaseEjemplo();
        claseEjemplo.Saludar();

        claseEjemplo.saludar2();
        //creamos una variable para guardar resultado de metodo de suma
        int resultado = claseEjemplo.suma(5,5);

        System.out.println(resultado);


        Scanner sc = new Scanner(System.in);
        //parametro de scanner(instancia para ocupar los datos)

    }
}
