import Objetos.*;

public class Actividad5App {

	public static void main(String[] args) {
		
		Estudiante[] estudiantes = crearArray();
		Aula aula = new Aula(001, 10, "F�sica");
		Profesor prof = new Profesor("Manolo", 40, 'H', "F�sica");
		
		if(aula.estaDisponible(prof, estudiantes)) {
			
			
			comprobarNota(estudiantes);
		}else {
			
		}
		
		
	}
	
	public static Estudiante[] crearArray() {
		
		Estudiante alfonso = new Estudiante("Alfonso",18, 'H', 7, 1);
		Estudiante maria = new Estudiante("Mar�a",17, 'M', 6, 2);
		Estudiante jose = new Estudiante("Jose",18, 'H', 9, 3);
		Estudiante pepe = new Estudiante("Pepe",17, 'H', 6, 4);
		Estudiante minerva = new Estudiante("Minerva",18, 'M', 5, 5);
		Estudiante antonio = new Estudiante("Antonio",17, 'H', 4, 6);
		Estudiante biel = new Estudiante("Biel",18, 'H', 4, 7);
		Estudiante victor = new Estudiante("V�ctor",17, 'H', 6, 8);
		Estudiante ricard = new Estudiante("Ricard",18, 'H', 7, 9);
		Estudiante oscar = new Estudiante("�scar",17, 'H', 6, 10);
		
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
	public static void comprobarNota(Estudiante[]estudiantes) {
		
		int aprobados=0;
		int chicos=0;
		int chicas=0;
		
		for(int i =0; i < estudiantes.length; i++) {
			
			if(estudiantes[i].getCalifica()>=5) {
			aprobados++;
			if(estudiantes[i].getSexo()=='H') {
				chicos++;
			}else {
				chicas++;
			}
			
			}
		}
		
		System.out.println("Alumnos aprobados: "+chicos);
		System.out.println("Alumnas aprobados: "+chicas);
		System.out.println("Alumnos totales aprobados: "+aprobados);
	}

}
