package POO;

public class Vehiculos {

	/*
	 * Tipos de identificadores de clases
	 * -PUBLIC: Accesible desde cualquier parte
	 * -PRIVATE: Accesible desde la propia clase (encapsulación)
	 * -PROTECTED: Accesible desde el mismo paquete y herencia
	 * -POR DEFECTO: Accesible desde el mismo paquete
	 * 
	 * Estos indicadores se pueden añadir a clases, variables, constructores, etc.
	 * */
	
	//Propiedades
	//Mejor usar private para no editar las propiedades directamente desde otras clases. 
	//solo usando constructores
	private int ruedas;
	private String color;
	private int largo;
	private int ancho;
	private int peso;
	private boolean climatizador;
	private boolean tapiceria;
	private boolean gps;
	
	//Constructor
	public Vehiculos() { //Deben llamarse igual que la clase
		//Si está sin parámentros es un constructor vacío, donde ponemos valores por defecto así:
		ruedas = 4;
		largo = 2;
		ancho = 1;
		peso = 2;
		color = "sin color";
	}
	
	public Vehiculos(int ruedas, int largo, int ancho, int peso, String color) { 
		//Puede haber varios constructores con el mismo nombre, diferenciandose en los parámetros que recibe
		this.ruedas = ruedas;
		this.largo = largo;
		this.ancho = ancho;
		this.peso = peso;
		this.color = color;
	}
	
	public Vehiculos(int ruedas) { 
		//Puede haber varios constructores con el mismo nombre, diferenciandose en los parámetros que recibe
		this.ruedas = ruedas;
		largo = 2;
		ancho = 1;
		peso = 2;
		color = "sin color";
	}
	
	//Métodos setters
	//void: el método no nos va a devolver ningún valor después de hacer su trabajo
	public void setColor(String color) { //Establece un valor recibido por parámetro
		//Si el parámetro que recibimos se llama igual que el campo de la clase
		//Se usa la palabra this
		this.color = color;
	}
	
	//Sobrecarga de constructores: Pueden llamarse igual siemprey cuando reciban distinto número de parámetros
	public void setExtra(boolean climatizador) {
		this.climatizador = climatizador;
	}
	
	public void setExtra(boolean gps, boolean climatizador) {
		this.climatizador = climatizador;
		this.gps = gps;
	}
	
	//Métodos getters
	public String getColor() { //Devuelve un valor
		return color;
	}
	
	public String getExtra() {
		if(climatizador) return "Tu coche tiene climatizador";
		else return "Tu coche no tiene climatizador";
	}
	
	public String getDatosVehiculo() { //Método para mostrar los datos
		String datos = "Tu vehículo tiene: " + 
				"ruedas = " + ruedas +
				", largo = " + largo +
				", ancho = " + ancho +
				", peso = " + peso +
				", color = " + color + 
				", climatizador = " + climatizador +
				", gps = " + gps +
				", tapicería = " + tapiceria;
		return datos;
				
	}
	
}
