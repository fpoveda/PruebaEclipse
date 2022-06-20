package paquete1;

public class Coche extends Vehiculo{
	
	private int numPuertas;
	private double tamMaletero;
	
	
	
	public Coche() {
		super();
	}



	public Coche(String marca, int numPuertas) {
		super(marca);
		this.numPuertas = numPuertas;
	}



	public Coche(String marca) {
		super(marca);
	}



	public int getNumPuertas() {
		return numPuertas;
	}



	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}



	public double getTamMaletero() {
		return tamMaletero;
	}



	public void setTamMaletero(double tamMaletero) {
		this.tamMaletero = tamMaletero;
	}
	

	
	

}
