package com.example;
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
    	
    	// Sentencia operaciones de agregado:
    	
    }
}
