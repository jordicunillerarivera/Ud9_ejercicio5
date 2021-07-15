package Objetos;

public abstract class Persona {

	// Atributos
	
	protected String nombre;
	protected int edad;
	protected char sexo;
	
	// Constructores
	
	public Persona() {

	}
	
	public Persona(String nombre, int edad) {

		this.nombre = nombre;
		this.edad = edad;

	}

	public Persona(String nombre, int edad, char sexo) {

		this.nombre = nombre;
		this.edad = edad;
		this.sexo = comprobarSexo(sexo);

	}
	
	// Metodos

		// Comprobar que el sexo introducido sea correcto
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
	
	// Setters & Getters

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
