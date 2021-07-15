package Objetos;

public abstract class Persona {

	protected String nombre;
	protected int edad;
	protected char sexo;
	
	public Persona(String nombre, int edad, char sexo) {
//		para definir clase Aula como línea de objeto
		
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;

		
	}
	
	public Persona(String nombre, int edad) {
		
		this.nombre = nombre;
		this.edad = edad;
		
	}
	
	public boolean profeBaja() { // 20% - 80%
		
		int rand = (int) (Math.random() * 10) + 1; // 1 - 10
		if (rand <= 2) return true;
		else return false;
		
	}
	
}
