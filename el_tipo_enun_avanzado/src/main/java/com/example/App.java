package com.example;

import java.util.Arrays;

/*
 * el enum tiene un método que se llama values()
 * y otro llamado ordinal()
 * 
 * Los ENUM pueden contener constructores
 */
public class App {
	
    public static void main(String[] args) {

    	System.out.println("frecuencia de visitantes al zoo en primavera.");
    	Estacion.SPRING.ImprimirVisitantesEsperados();

    	
    	System.out.println("El horario es: " + Estacion.SPRING.getHorario());
    	
    	Arrays.stream(Estacion.values())
        .forEach(e -> System.out.println("En " + e + " el horario es: " + e.getHorario()));

    }
}
