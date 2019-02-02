package com.equipo;

public class Masajista extends SeleccionFutbol {
	
	private String titulacion;
	private Integer aniosExperiencia;
	
	Masajista(){
		
	}
	
	Masajista(Integer id, String nombre, String apellidos, Integer edad, String titulacion, Integer aniosExperiencia){
		super(id, nombre,apellidos, edad);
		this.titulacion = titulacion;
		this.aniosExperiencia = aniosExperiencia;
	}
	
	public void DarMasaje() {
		System.out.println("metodo dar masaje clase masajista");
	}
	
	@Override
	public void Concentrarse() {
		System.out.println("metodo concentrarse clase masajista");
	};
	
	@Override
	public void Viajar() {
		System.out.println("metodo viajar clase masajista");
	};
	
	@Override
	public void Entrenamiento() {
		System.out.println("metodo entrenamiento clase masajista");
	}
	
	@Override
	public void PartidoFutbol() {
		System.out.println("metodo partido futbol clase masajista");
	};
	
	//GET
	public String getTitulacion() {
		return titulacion;
	}
	
	public Integer getAniosExperiencia() {
		return aniosExperiencia;
	}
		
	//SET
	public void setTitulacion(String titulacion) {
		this.titulacion=titulacion;
	}
	
	public void setAniosExperiencia(Integer aniosExperiencia) {
		this.aniosExperiencia=aniosExperiencia;
	}
	
}
