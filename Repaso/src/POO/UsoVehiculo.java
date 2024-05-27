package POO;

public class UsoVehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehiculos coche1 = new Vehiculos();
		System.out.println(coche1.getColor());
		coche1.setColor("Azul");
		System.out.println(coche1.getColor());
		coche1.setColor("Verde");
		System.out.println(coche1.getColor());
		
		Vehiculos coche2 = new Vehiculos();
		System.out.println(coche2.getColor());
		coche2.setColor("Amarillo");
		System.out.println(coche1.getColor());
		System.out.println(coche1.getDatosVehiculo());
		System.out.println(coche2.getColor());
		System.out.println(coche2.getDatosVehiculo());
		coche1.setExtra(true);
		coche2.setExtra(true, false);
		System.out.println(coche1.getDatosVehiculo());
		System.out.println(coche2.getDatosVehiculo());
		
		System.out.println(coche1.getExtra());
		System.out.println(coche2.getExtra());
	}

}
