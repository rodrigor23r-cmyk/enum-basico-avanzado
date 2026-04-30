package com.example;

/*
 * Los enum pueden contener constructores, campos propiedades o atributos y métodos
 * 
 * Zoológico - afluencia de visitantes según la época del año
 * */


public enum Estacion {
	
	SPRING("Media") {
		@Override
		public String getHorario() {
			// TODO Auto-generated method stub
			return "de 9:00 h. hasta 17:00 h.";
		}
	}, 
	SUMMER("Alta") {
		@Override
		public String getHorario() {
			// TODO Auto-generated method stub
			return "de 9:00 h. hasta 21:00 h.";
		}
	}, 
	FALL("Media") {
		@Override
		public String getHorario() {
			// TODO Auto-generated method stub
			return "de 9:00 h. hasta 19:00 h.";
		}
	}, 
	WINTER("Baja") {
		@Override
		public String getHorario() {
			// TODO Auto-generated method stub
			return "de 10:00 h. hasta 15:00 h.";
		}
	};
	
	// declaramos una variable
	private final String expectedVisitors;
	
	// este es el constructor:
	private Estacion(String visitantesEsperados) {

		this.expectedVisitors = visitantesEsperados;
	}
	
	
	// un método que imprime la frecuencia de visitantes:
	public void ImprimirVisitantesEsperados() {
		System.out.println(expectedVisitors);
	}
	
	public abstract String getHorario(); //abstracto no tiene cuerpo. al declarar esta línea se han marcado en rojo los 
										// SPRING, SUMMER, ... Implementas la sugerencia y sobrescribes el método.
	
}
