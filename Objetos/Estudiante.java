package Objetos;

import Interfaces.Asisteable;

public class Estudiante extends Persona implements Asisteable{

	private int califica;
	private int asiento;
	private final int CALIFICA = 5;
	
	public Estudiante(String nombre, int edad, char sexo, int califica, int asiento) {
		
		super(nombre, edad, sexo);
		this.califica = califica;
		this.asiento = asiento;
		
	}
	
	public Estudiante(String nombre, int edad) {
		
		super(nombre, edad);
		this.califica = CALIFICA;
		
	}
	
	public Estudiante() {
		
		
	}
	
	public boolean asistencia() { // 50-50%
		
		int rand = (int) (Math.random() * 2) + 1; // 1 - 2
		if (rand == 1) return true;
		else return false;
		
	}
	
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
