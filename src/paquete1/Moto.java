package paquete1;

public class Moto extends Vehiculo {

	private boolean portacascos;

	
	
	
	public Moto(String marca) {
		super(marca);
	}
	
	

	public Moto(String marca, boolean portacascos) {
		super(marca);
		this.portacascos = portacascos;
	}



	public Moto(String matricula, String marca, double caballos, boolean portacascos) {
		super(matricula, marca, caballos);
		this.portacascos = portacascos;
	}

	public Moto(boolean portacascos) {
		super();
		this.portacascos = portacascos;
	}

	public boolean isPortacascos() {
		return portacascos;
	}

	public void setPortacascos(boolean portacascos) {
		this.portacascos = portacascos;
	}
	
	
	public void obtenerPrecio() {
		
		double precio=0;
		
		precio= this.getCaballos()*1000;
		
		if (this.portacascos) precio = precio + 1000;
		
		System.out.println("El precio es "+ precio);
		
	}
	
	
}
