package es.studium.Orquesta;

public class Musico {
private String nombre;
private char sexo;
public Musico () {
	nombre="";
	sexo=' ';/*espacio vacio para tipo char*/
	}
public Musico(String nombre, char sexo) {
	super();
	this.nombre = nombre;
	this.sexo = sexo;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public char getSexo() {
	return sexo;
}
public void setSexo(char sexo) {
	this.sexo = sexo;
}

}
