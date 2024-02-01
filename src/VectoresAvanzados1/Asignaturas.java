package VectoresAvanzados1;

public class Asignaturas {

	
	private String nombre;
	@Override
	public String toString() {
		return "Asignaturas [nombre=" + nombre + ", notaPrimeraEval=" + notaPrimeraEval + ", notaSegundaEval="
				+ notaSegundaEval + ", notaTerceraEval=" + notaTerceraEval + "]";
	}
	private float notaPrimeraEval;
	private float notaSegundaEval;
	private float notaTerceraEval;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getNotaPrimeraEval() {
		return notaPrimeraEval;
	}
	public void setNotaPrimeraEval(float notaPrimeraEval) {
		this.notaPrimeraEval = notaPrimeraEval;
	}
	public float getNotaSegundaEval() {
		return notaSegundaEval;
	}
	public void setNotaSegundaEval(float notaSegundaEval) {
		this.notaSegundaEval = notaSegundaEval;
	}
	public float getNotaTerceraEval() {
		return notaTerceraEval;
	}
	public void setNotaTerceraEval(float notaTerceraEval) {
		this.notaTerceraEval = notaTerceraEval;
	}
}
