package Objetos;

public class Aula {
	
	private int identificador;
	private int capacidad;
	private String materia;
	private final int CAPACIDAD = 10;
	
	public Aula() {
		
		this.capacidad = CAPACIDAD;
		
	}
	
	public Aula(int identificador, int capacidad, String materia) {
		
		this.identificador = identificador;
		this.capacidad = capacidad;
		this.materia = materia;
		
	}
	
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

	@Override
	public String toString() {
		return "Aula [identificador=" + identificador + ", capacidad=" + capacidad + ", materia=" + materia + "]";
	}
	
	
	
}
