package es.studium.Orquesta;

public class Instrumentos {
	private String nombre;
	private char afinacion;

	public Instrumentos() {
		nombre = "";
		afinacion = ' ';
	}

	public Instrumentos(String nom, char afina) {
		super();
		this.nombre = nom;
		this.afinacion = afina;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public char getAfinacion() {
		return afinacion;
	}

	public void setAfinacion(char afinacion) {
		this.afinacion = afinacion;
	}

}
