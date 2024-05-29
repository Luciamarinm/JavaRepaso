package poo_Ejercicio4;

public class Colegio {

	private final String nombreColegio;
	private Alumno arrayAlumnos[]; //Array de objetos alumnos que pertenecen al colegio
	private int posicionArray = 0; //Contador de posiciones que contiene el array
	
	public Colegio(String nombre, int nAlumno) {
		this.nombreColegio = nombre;
		arrayAlumnos = new Alumno[nAlumno];
	}

	public String getNombreColegio() {
		return nombreColegio;
	}
	
	private Alumno getAlumno(int nAlumno) {
		return arrayAlumnos[nAlumno];
	}
	
	
	public void nuevoAlumno(String nombreAlumno, double notaAlumno) {
		Alumno nuevoAlumno = new Alumno(this, nombreAlumno, notaAlumno);
		arrayAlumnos[posicionArray] = nuevoAlumno;
		posicionArray++;
	}
	
	public void expulsarAlumno(String nombreAlumno) {
		for(int i = 0; i < arrayAlumnos.length; i++) {
			if(this.getAlumno(i) != null) {
				if(arrayAlumnos[i].getNombreAlumno().equals(nombreAlumno)) {
					arrayAlumnos[i] = null;
				}
			}
		}
	}
	public void setNotaMedia(String nombreAlumno, double nuevaNotaMedia) {
		for(int i = 0; i < arrayAlumnos.length; i++) {
			if(this.getAlumno(i) != null) {
				if(arrayAlumnos[i].getNombreAlumno().equals(nombreAlumno)) {
					arrayAlumnos[i].setNotaMedia(nuevaNotaMedia);;
				}
			}
		}
	}
	
	public void getTodosAlumnos() {
		for(int i = 0; i < arrayAlumnos.length; i++) {
			if(this.getAlumno(i) != null) {
				System.out.println(this.getAlumno(i));
				System.out.println();
			}
		}
	}
	public void getDatosAlumno(String nombreAlumno) {
		for(int i = 0; i < arrayAlumnos.length; i++) {
			if(this.getAlumno(i) != null) {
				if(arrayAlumnos[i].getNombreAlumno().equals(nombreAlumno)) {
					System.out.println(this.getAlumno(i));
					System.out.println();
				}
			}
		}
	}
	
	
	
	
}
