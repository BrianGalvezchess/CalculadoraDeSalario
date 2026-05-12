package com.example.poo;

public class ClaseEjemplo {
    //no es estatico
    //pertenece al objeto
    public void Saludar() {
        System.out.println("Hola mundo");
    }

    public static void saludar2(){
        //los metodos estaticos pertenecen a la clase
        //mandar a llamar a la clase
        System.out.println("Hola Brian King");
    }

    public int suma (int a , int b){
        return a+b;
    }
}
