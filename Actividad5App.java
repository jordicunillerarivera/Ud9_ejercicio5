import Objetos.*;

public class Actividad5App {

	public static void main(String[] args) {
		
		Estudiante[] estudiantes = crearArray();
		Aula aula = new Aula(001, 10, "Física");
		Profesor prof = new Profesor("Manolo", 40, 'H', "Física");
		
		if(aula.estaDisponible(prof, estudiantes)) {
			
			System.out.print("Hola");
			
		}
		
		
	}
	
	public static Estudiante[] crearArray() {
		
		Estudiante alfonso = new Estudiante("Alfonso",18, 'H', 7, 1);
		Estudiante maria = new Estudiante("María",17, 'M', 6, 2);
		Estudiante jose = new Estudiante("Jose",18, 'H', 9, 3);
		Estudiante pepe = new Estudiante("Pepe",17, 'H', 6, 4);
		Estudiante minerva = new Estudiante("Minerva",18, 'M', 5, 5);
		Estudiante antonio = new Estudiante("Antonio",17, 'H', 4, 6);
		Estudiante biel = new Estudiante("Biel",18, 'H', 4, 7);
		Estudiante victor = new Estudiante("Víctor",17, 'H', 6, 8);
		Estudiante ricard = new Estudiante("Ricard",18, 'H', 7, 9);
		Estudiante oscar = new Estudiante("Óscar",17, 'H', 6, 10);
		
		Estudiante[] estudiantes = {
				
			alfonso,
			maria,
			jose,
			pepe,
			minerva,
			antonio,
			biel,
			victor,
			ricard,
			oscar
				
		};
		
		return estudiantes;
	}

}
