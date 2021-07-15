package Objetos;

import Interfaces.Asisteable;

public class Profesor extends Persona implements Asisteable{

	private String materia;	
	
	public Profesor(String materia) {
		
		this.materia = materia;
		
	}
	
	public Profesor(String nombre, int edad, char sexo, String materia) {
		
		super(nombre, edad, sexo);
		this.materia = materia;
		
	}
	
	public boolean asistencia() { // 20% - 80%
		
		int rand = (int) (Math.random() * 10) + 1; // 1 - 10
		if (rand <= 2) {
			return true;
		}
		else {
			return false;
		}
		
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}
	
}
