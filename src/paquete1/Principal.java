package paquete1;

public class Principal {
	
	static int varGen=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		varGen++;
		
//		Vehiculo vehiculo0 = new Vehiculo("3456ASE", "Opel", 110);
//		Vehiculo vehiculo1 = new Vehiculo("2763CRT", "Seat", 90);
//		Vehiculo vehiculo2 = new Vehiculo("2444CRT", "Renault", 100);
//		
//		System.out.println(Vehiculo.numVehiculos);
//		
//		System.out.println(vehiculo0);
//		System.out.println(vehiculo1);
		
		
		Vehiculo.impMatr=0.03;
		
	//	Coche coche0 = new Coche("8929FRT", "Seat", 120, 4, 50);
		System.out.println(Vehiculo.numVehiculos);
		
	//	coche0.setColor("amarillo");
		
	//	Coche coche1 = new Coche("Opel", 5);
		
		Coche coche0 = new Coche("Seat");
		Coche coche1 = new Coche("Opel");
		Coche coche2 = new Coche("Renault");
		
		Moto moto0 = new Moto("Honda");
		Moto moto1 = new Moto("Aprilia", true);
		Moto moto2 = new Moto("Kawasaky");	
		
		Coche arrayCoches[] = {coche0, coche1, coche2};
		Moto arrayMotos[] = {moto0, moto1, moto2};
		
		Vehiculo arrayVehiculos[] = {coche0, coche1, coche2, moto0, moto1, moto2};
		
		
		for (int i = 0; i < arrayVehiculos.length; i++) {
			
			if (arrayVehiculos[i] instanceof Coche) {
				
				System.out.println("Coche: " + arrayVehiculos[i].getMarca());
				System.out.println("Puertas: " + arrayCoches[i].getNumPuertas());
				
			}
			
			if (arrayVehiculos[i] instanceof Moto) {
				
				System.out.println("Moto: " + arrayVehiculos[i].getMarca());
				System.out.println("Portacasco: " + arrayMotos[i-arrayCoches.length].isPortacascos());
			}		
			
			
		}
		System.out.println("***");
		System.out.println(arrayCoches[0].getMarca());
		
		arrayVehiculos[0].setMarca("Citroen");
		
		System.out.println(arrayCoches[0].getMarca());
		System.out.println("***");
//		
//		moto0.setMarca("Seat");
//		
//		System.out.println(moto0.getMarca());
//		
//		moto0.setCaballos(70);
//		
//		moto0.obtenerPrecio();
		
		
	}

}
