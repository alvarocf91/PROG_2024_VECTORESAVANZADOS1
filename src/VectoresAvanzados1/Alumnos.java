package VectoresAvanzados1;

import java.util.Arrays;

public class Alumnos {

	private Asignaturas[] asignaturas;
	private int cuantasAsignaturas;
	private String nombre;
	private String apellidos;
	private int telefono;
	private float calificacion;
	
	
public void add(Asignaturas asignatura) {
		
		if(cuantasAsignaturas<asignaturas.length) {
			asignaturas[cuantasAsignaturas] = asignatura;
			cuantasAsignaturas++;
		}
   }
	@Override
public String toString() {
	return "Alumnos [asignaturas=" + Arrays.toString(asignaturas) + ", nombre=" + nombre + ", apellidos=" + apellidos
			+ ", telefono=" + telefono + ", calificacion=" + calificacion + "]";
}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public float getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(float calificacion) {
		this.calificacion = calificacion;
	}
}
