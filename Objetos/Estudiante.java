package Objetos;

import Interfaces.Asisteable;

public class Estudiante extends Persona implements Asisteable{

	// Atributos
	
	private int califica;
	private int asiento;
	
	// Constantes
	
	private final int CALIFICA = 5;
	
	// Constructores
	
	public Estudiante() {
			
		}
	
	public Estudiante(String nombre, int edad) {
		super(nombre, edad);
		
		this.califica = CALIFICA;
	}
	
	public Estudiante(String nombre, int edad, char sexo, int califica, int asiento) {
		super(nombre, edad, sexo);
		
		this.califica = califica;
		this.asiento = asiento;
	}
	
	// Metodos
	
		// Metodo para comprobar la asistencia
	public boolean asistencia() { // 50-50%
		
		int rand = (int) (Math.random() * 2) + 1; // 1 - 2
		if (rand == 1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	// Setters & Getters
	
	public int getCalifica() {
		return califica;
	}

	public void setCalifica(int califica) {
		this.califica = califica;
	}

	public int getAsiento() {
		return asiento;
	}

	public void setAsiento(int asiento) {
		this.asiento = asiento;
	}
	
}
