package VectoresAvanzados1;

import java.util.Arrays;

public class Aula {

	
	private Alumnos[] alumnos;
	private int cuantos;
	
	
	public Aula (int huecos) {
		
		this.alumnos = new Alumnos[huecos];
		this.cuantos = 0;
	}
public void add(Alumnos alumno) {
		
		if(cuantos<alumnos.length) {
			alumnos[cuantos] = alumno;
			cuantos++;
		}
	
}
}