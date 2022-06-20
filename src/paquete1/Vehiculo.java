package paquete1;
import java.util.Arrays;

public class Vehiculo {

	private String matricula;
	private String marca;
	private double caballos;
	private String color;
	static int numVehiculos;
	static double impMatr = 0.02;

	
	
	
	
	@Override
	public String toString() {
		
		String ret="";
		ret = "El vehiculo tiene matricula " + this.matricula;
		return ret;
	}

	

	public Vehiculo() {
		super();
	}

	


	public Vehiculo(String marca) {
		super();
		this.marca = marca;
	}



	public Vehiculo(String marca, double caballos, String color) {
		super();
		this.marca = marca;
		this.caballos = caballos;
		this.color = color;
	}



	public Vehiculo(String matricula, String marca, double caballos) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.caballos = caballos;
		this.numVehiculos++;
	}


	

	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public double getCaballos() {
		return caballos;
	}


	public void setCaballos(double caballos) {
		this.caballos = caballos;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	
	
}
