package com.senati.eti.model;

public class Alumno {
	// Atributos
	private String nombre;
	private String apellido;
	private String genero;
	private int edad;
	
	// Gatters and Setters
	public String getNombre() {
		return this.nombre;
		
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
		
	}
	public String getApellido() {
		return this.apellido;
		
	}
	public void setApellido(String apelido) {
		this.apellido = apellido;
		
	}
	public String getGenero() {
		return this.genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getEdad() {
		return this.edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Alumno(String nombre, String apellido, String genero, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.genero = genero;
		this.edad = edad;
	}
	// Contructores
	public Alumno() {
		super();
	}
	
	public String NombreCompleto() {
		return this.nombre + " " + this.apellido;
	}
	
	public String MostrarGenero() {
		/*
		String m = ";
		
		if (this.genero.equals("F"))
		m = "Femenino";
		else if (this.genero.equals("M"))
		m = "Masculino";
		return m;
		 */
		// Operasor condicional
		// (Condicion ? valorV : ValorF);
		return (this.genero.equals("F") ? "Femenino" : "Masculino");
	}
	
	public String MostrarEstado() {
		return (this.edad >= 18 ? "Mayor de edad" : "Menor de edad");
	}
	
}
