package VectoresAvanzados1;

public class Start {

	public static void main(String[] args) {
		
		
		Alumnos a1 = new Alumnos();
		a1.setNombre("Juan");
		a1.setApellidos("Fernández");
		a1.setTelefono(612345678);
		
		Alumnos a2 = new Alumnos();
		a2.setNombre("Alfredo");
		a2.setApellidos("Fernández");
		a2.setTelefono(987654321);
	
		Aula aula = new Aula(5);
		aula.add(a1);
		aula.add(a2);	
		
		
			
			
		

	}

}
