package com.equipo;

public class Futbolista extends SeleccionFutbol {
	
	private Integer dorsal;
	private String demarcacion;
	
	Futbolista(){
		
	}
	
	Futbolista(Integer id, String nombre, String apellidos, Integer edad, Integer dorsal, String demarcacion){
		super(id, nombre,apellidos, edad);
		this.dorsal = dorsal;
		this.demarcacion = demarcacion;
	}
	
	public void Entrevista() {
		System.out.println("Metodo entrevista clase futbolista");
	}
	
	@Override
	public void Concentrarse() {
		System.out.println("Metodo concentrarse clase futbolista");
	};
	
	@Override
	public void Viajar() {
		System.out.println("Metodo viajar clase futbolista");
	};
	
	@Override
	public void Entrenamiento() {
		System.out.println("metodo entrenamiento clase futbolista");
	}
	
	@Override
	public void PartidoFutbol() {
		System.out.println("Metodo partido futbol clase futbolista");
	}
	
	//GET
	public Integer getDorsal() {
		return dorsal;
	}
	
	public String getDemarcacion() {
		return demarcacion;
	}
	
	//SET
	public void setDorsal(Integer dorsal) {
		this.dorsal=dorsal;
	}
	
	public void setDemarcacion(String demarcacion) {
		this.demarcacion=demarcacion;
	}
	
}
