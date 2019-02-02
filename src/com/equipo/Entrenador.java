package com.equipo;

public class Entrenador extends SeleccionFutbol {
	
	private String idFederacion;
	
	Entrenador(){
		
	}
	
	Entrenador(Integer id, String nombre, String apellidos, Integer edad, String idFederacion){
		//super();
		super(id, nombre, apellidos, edad);
		this.idFederacion = idFederacion;
	}
	
	
	public void PlanificarEntrenamiento() {
		System.out.println("metodo planificar entrenamiento clase entrenador");
	}
	
	@Override
	public void Concentrarse() {
		System.out.println("metodo concentrarse clase entrenador");
	}
	
	@Override
	public void Viajar() {
		System.out.println("metodo viajar clase entrenador");
	}
	
	@Override
	public void Entrenamiento() {
		System.out.println("metodo entrenamiento clase entrenador");
	}
	
	@Override
	public void PartidoFutbol() {
		System.out.println("Metodo partido futbol clase entrenador");
	}
	
	
	//GET
	public String getIdFederacion() {
		return idFederacion;
	}
	
	//SET
	public void setIdFederacion(String idFederacion) {
		this.idFederacion=idFederacion;
	}
}
