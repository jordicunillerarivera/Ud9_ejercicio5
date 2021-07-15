package Objetos;

public abstract class Persona {

	protected String nombre;
	protected int edad;
	protected char sexo;

	public Persona(String nombre, int edad, char sexo) {
//		para definir clase Aula como línea de objeto

		this.nombre = nombre;
		this.edad = edad;
		this.sexo = comprobarSexo(sexo);

	}

	public Persona(String nombre, int edad) {

		this.nombre = nombre;
		this.edad = edad;

	}

	public Persona() {

	}
	

	public char comprobarSexo(char sexo) {

		sexo = Character.toLowerCase(sexo);
		switch (sexo) {

		case 'h':

			return 'H';

		case 'm':

			return 'M';

		default:

			return 'H';

		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	

}
