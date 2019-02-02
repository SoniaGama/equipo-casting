package com.equipo;

import java.util.ArrayList;
import java.util.List;

public class EquipoFutbolMain {

	public static void main(String[] args) {
		


		//instanciar
		Futbolista futbolistaOne = new Futbolista(1, "futbolista 1", "apellidos futbolista 1", 20, 10, "demarcacion ejemplo");
		Entrenador entrenadorOne = new Entrenador(2, "entrenador 1", "apellidos entrenador 1", 20, "federacion id");				
		Masajista masajistaOne = new Masajista(3, "masajista 1", "apellidos masajista 1", 30, "titulo masajista", 10 );

		// Crear lista
		List<SeleccionFutbol> listaSeleccionados = new ArrayList<SeleccionFutbol>();
		
		//agregar a la lista
		listaSeleccionados.add(futbolistaOne);
		listaSeleccionados.add(entrenadorOne);
		listaSeleccionados.add(masajistaOne);
		
		// iterar e imprimir el metodo concentarse y viajar
		for(SeleccionFutbol seleccionFutbol : listaSeleccionados) {
			
			seleccionFutbol.Concentrarse();			
			seleccionFutbol.Viajar();
			seleccionFutbol.Entrenamiento();
			seleccionFutbol.PartidoFutbol();
			
			System.out.println("\n");
		}
		
		//Futbolsta: Entrenamiento(), Entrevista()
		//Entrenador: PlanificarEntrenamiento()
		//Masajista: DarMasaje()
		
		/*
		futbolistaOne.Entrevista();	
		entrenadorOne.PlanificarEntrenamiento();
		masajistaOne.DarMasaje();
		
		//System.out.println(entrenadorOne.MENSAJE);
		*/
		
		//Crear lista para ejemplo de cast
		//List<SeleccionFutbol> listaSeleccionados = new ArrayList<SeleccionFutbol>();
		List<Object> listaSeleccion2 = new ArrayList<Object>();
		
		SeleccionFutbol futbolista2 = new Futbolista(1, "futbolista 2", "apellidos futbolista 2", 20, 10, "demarcacion ejemplo");		
		SeleccionFutbol entrenador2 = new Entrenador(2, "entrenador 2", "apellidos entrenador 2", 20, "federacion id");
		SeleccionFutbol masajista2 = new Masajista(3, "masajista 2", "apellidos masajista 2", 30, "titulo masajista", 10 );

		
		listaSeleccion2.add(futbolista2);		
		listaSeleccion2.add(entrenador2);		
		listaSeleccion2.add(masajista2);
		
		System.out.println("PARA EJEMPLO CAST \n");		

		//entrenador2 = (Entrenador)futbolista;
		
		for(Object seleccionFutbol2 :  listaSeleccion2) {		
			((Futbolista) seleccionFutbol2).Concentrarse();
		}		
		
	}

}
