package POO;

public class UsoEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Esto sería una instancia
		Empleados empleado1 = new Empleados("Jose");
		
		System.out.println(empleado1.getDatosEmpleado());
		empleado1.setSeccion("RRHH");
		System.out.println(empleado1.getDatosEmpleado());
		
		Empleados empleado2 = new Empleados("Lucía");
		System.out.println(empleado2.getDatosEmpleado());
		
		Empleados empleado3 = new Empleados("Marta");
		System.out.println(empleado3.getDatosEmpleado());
		
		System.out.println(Empleados.getIdSiguiente());
	}

}

//Cuando hay varias clases en un mismo lugar, solo una tendrá el método main y public
class Empleados {
	
	//Al usar la palabra final, se convierte en una constante y eso quiere decir que 
	//el valor de esa propiedad en ese objeto, no se puede cambiar una vez se asigna
	private final String nombre;
	private String seccion;
	//Static hace que esta variable sea de la clase y no de ninguna instancia
	//Si queremos usarlo fuera de la clase, deberemos llamar primero a la clase Empleados.id
	private static int idSiguiente = 1;
	private int id;
	
	public Empleados(String nombre) {
		this.nombre = nombre;
		seccion = "Administración";
		id = idSiguiente;
		idSiguiente++;
	}
	
	//Void implica que no devuelve nada el método, no usa el return
	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
	
	public String getDatosEmpleado() {
		return "El empleado " + nombre + " pertenece a la sección de " + seccion + " y tiene el nº " + id;
	}
	
	//Métodos static:
	/*
	 * -No actúan sobre objetos
	 * -No acceden a campos de ejemplar(variables/constantes declaradas en la clase),
	 * a menos que estas sean también static.
	 * -Para llamarlos se utiliza el nombre_clase.nombre_metodo*/
	
	public static String getIdSiguiente() {
		return "El id del siguiente empleado será: " + idSiguiente;	}
}
