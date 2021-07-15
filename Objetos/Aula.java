package Objetos;

public class Aula {
	
	// Atributos
	
	private int identificador;
	private int capacidad;
	private String materia;
	
	// Constantes
	
	private final int CAPACIDAD = 10;
	
	// Constructor
	
	public Aula() {
		
		this.capacidad = CAPACIDAD;
	}
	
	public Aula(int identificador, int capacidad, String materia) {
		
		this.identificador = identificador;
		this.capacidad = capacidad;
		this.materia = materia;
	}
	
	// Metodos
	
		// Metodo para comprobar si se hace clase
	public boolean estaDisponible(Profesor profesor, Estudiante[] estudiantes) {
		
		int cont = 0;
		boolean aux = false;
		
		if(profesor.asistencia()) {
			
			if(profesor.getMateria().toLowerCase().equals(this.materia.toLowerCase())) {
				
				aux = true;

			}
		}
		
		for(int a = 0; a < estudiantes.length; a++) {
			
			if(estudiantes[a].asistencia()) {
				
				cont++;
        
			}
		}
		
		if(aux && (cont >= this.capacidad / 2)) {
			
			return true;
			
		} 
		
		else return false;
		
	}

	// Setters & Getters
	
	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}	
	
}
