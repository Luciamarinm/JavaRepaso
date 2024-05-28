package poo_Ejercicio3;

public class Banco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CuentaCorriente Cuenta1 = new CuentaCorriente("Juan", 100);
		CuentaCorriente Cuenta2 = new CuentaCorriente("Sofía", 200);
		System.out.println(Cuenta1.getDatosCuenta());
		System.out.println(Cuenta2.getDatosCuenta());
		CuentaCorriente.transferencia(Cuenta1, Cuenta2, 15);
		System.out.println(Cuenta1.getDatosCuenta());
		System.out.println(Cuenta2.getDatosCuenta());
	}

}
