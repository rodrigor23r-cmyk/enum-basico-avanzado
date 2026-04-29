package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
 * el enum tiene un método que se llama values()
 */
public class App {
	
    public static void main(String[] args) {

    	// Sentencia FOR mejorado:
    	
    	for (Season season : Season.values()) {
    		System.out.println("nombre: "+ season.name()
    		+ ", ordinal: " + season.ordinal());
    	}
    	
    	/* Sentencia operaciones de agregado
    	
    	List<Season> seasons = new ArrayList<>(Arrays.asList(Season.values()));

    	*/
    	
    	 Stream<Season> flujoDeSeason = Arrays.stream(Season.values());
    	
    	 flujoDeSeason.forEach(season -> System.out.println("nombre: " + season.name() + ", ordinal: " + season.ordinal()));
    	  
    	 // sin declarar la variable flujoDeSeason
    	 Arrays.stream(Season.values()).forEach(sea -> System.out.println("nombre: " + sea.name() + ", ordinal: " + sea.ordinal()));
    	 /*
    	  * el método stream de la clase arrays genera un flujo a partir un array
    	  * */
    	 System.out.println("========================de mi cosecha========================");
    	 Stream.of(Season.values()).forEach(sea -> System.out.println("nombre: " + sea.name() + ", ordinal: " + sea.ordinal()));
    	 
    }
}