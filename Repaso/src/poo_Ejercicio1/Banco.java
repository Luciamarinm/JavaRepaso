package poo_Ejercicio1;

public class Banco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CuentaCorriente Cuenta1 = new CuentaCorriente("Lucía", 100);
		CuentaCorriente Cuenta2 = new CuentaCorriente("Jose", 50);
		System.out.println(Cuenta1.getDatosCuenta());
		System.out.println(Cuenta2.getDatosCuenta());
		CuentaCorriente.Transferencia(Cuenta1, Cuenta2, 50);
		System.out.println(Cuenta1.getDatosCuenta());
		System.out.println(Cuenta2.getDatosCuenta());
		Cuenta1.setIngreso(500);
		Cuenta2.setReintegro(50);
		System.out.println(Cuenta1.getDatosCuenta());
		System.out.println(Cuenta2.getDatosCuenta());
	}

}
