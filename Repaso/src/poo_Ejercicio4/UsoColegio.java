package poo_Ejercicio4;

public class UsoColegio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Colegio SanJavier = new Colegio("San Javier", 200);

		SanJavier.nuevoAlumno("Juan", 8.5);
		SanJavier.getTodosAlumnos();
		SanJavier.getDatosAlumno("Juan");
		
		Colegio Cervantes = new Colegio("Cervantes", 300);
		Cervantes.nuevoAlumno("Antonio", 7);
		Cervantes.nuevoAlumno("José", 9);
		Cervantes.getTodosAlumnos();
		Cervantes.expulsarAlumno("Antonio");
		Cervantes.getTodosAlumnos();
		Cervantes.setNotaMedia("José", 10);
		Cervantes.getTodosAlumnos();
		

		
		
	}

}
