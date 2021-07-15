package Objetos;

import Interfaces.Asisteable;

public class Profesor extends Persona implements Asisteable{
	
	// Atributos

	private String materia;
	
	// Constructores
	
	public Profesor(String materia) {
		
		this.materia = materia;
	}
	
	public Profesor(String nombre, int edad, char sexo, String materia) {
		super(nombre, edad, sexo);
		
		this.materia = materia;
	}
	
	// Metodos
	
		// Metodo para comprobar la asistencia
	public boolean asistencia() { // 20% - 80%
		
		int rand = (int) (Math.random() * 10) + 1; // 1 - 10
		if (rand <= 2) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	// Setters & Getters

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}
	
}
