package poo_Ejercicio4;

public class Alumno {

	private Colegio nombreColegio;
	private String nombreAlumno;
	private double notaMedia;
	private static int numeroAlumno = 1;
	private int nAlumno;
	
	public Alumno(Colegio nombreColegio, String nombreAlumno, double notaMedia) {
		this.nombreColegio = nombreColegio;
		this.nombreAlumno = nombreAlumno;
		this.notaMedia = notaMedia;
		nAlumno = numeroAlumno;
		numeroAlumno++;
	}
	
	private String getNombreColegioAlumno() {
		return this.nombreColegio.getNombreColegio();
	}
	
	public String getNombreAlumno() {
		return nombreAlumno;
	}
	
	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}
	
	public String toString() {
		return "Nombre alumno: " + nombreAlumno + "\nColegio: " +
				this.getNombreColegioAlumno() + "\nNº alumno: " + nAlumno +
				"\nNota media: " + notaMedia;
	}
	
	
}
