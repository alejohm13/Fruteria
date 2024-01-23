package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nombreFruta;
        boolean estaEnTemporada=true;
        Integer costoCarga;

        Scanner leer=new Scanner(System.in);

        System.out.print("Ingrese la fruta: ");
        nombreFruta=leer.nextLine();

        System.out.print("Esta en temporada: ");
        estaEnTemporada=leer.nextBoolean();

        if(estaEnTemporada==true){
            System.out.print("La fruta es Colombiana? ");
            boolean esColombiana=leer.nextBoolean();
            if (esColombiana==true){
                costoCarga=1000000;
                System.out.println("El costo es:"+costoCarga);
            }else{
                costoCarga=350000;
                System.out.println("El costo es:"+costoCarga);
            }
        }else{

        }

    }
}