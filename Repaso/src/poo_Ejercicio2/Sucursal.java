package poo_Ejercicio2;

public class Sucursal {

		private int numeroSucursal;
		private String direccion;
		private String ciudad;
		
		public Sucursal(int numeroSucursal, String direccion, String ciudad) {
			this.numeroSucursal = numeroSucursal;
			this.direccion = direccion;
			this.ciudad = ciudad;
		}

		public int getNumeroSucursal() {
			return numeroSucursal;
		}

		public String getDireccion() {
			return direccion;
		}

		public String getCiudad() {
			return ciudad;
		}
		
		public double calculaPrecio(Paquete paquete) {
			double precio;
			precio = paquete.getPeso();
			if(paquete.getPrioridadEnvio() == 0) precio = 0;
			if(paquete.getPrioridadEnvio() == 1) precio += 10;
			if(paquete.getPrioridadEnvio() == 2) precio += 20;
			
			return precio;
			
		}
}
